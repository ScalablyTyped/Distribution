package typings.octokitCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnyFunction = js.Function1[/* args */ js.Any, js.Any]
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type OctokitPlugin = js.Function2[
    /* octokit */ typings.octokitCore.mod.Octokit, 
    /* options */ typings.octokitCore.typesMod.OctokitOptions, 
    org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Unit
  ]
  type RequestParameters = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
  type ReturnTypeOf[T /* <: typings.octokitCore.typesMod.AnyFunction | js.Array[typings.octokitCore.typesMod.AnyFunction] */] = (typings.octokitCore.typesMod.UnionToIntersection[
    typings.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]) | typings.std.ReturnType[T]
  type UnionToIntersection[Union] = js.Any
}
