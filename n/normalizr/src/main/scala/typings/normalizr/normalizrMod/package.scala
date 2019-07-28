package typings.normalizr

import org.scalablytyped.runtime.StringDictionary
import typings.normalizr.normalizrMod.schemaNs.Array
import typings.normalizr.normalizrMod.schemaNs.Entity
import typings.normalizr.normalizrMod.schemaNs.Object
import typings.normalizr.normalizrMod.schemaNs.Union
import typings.normalizr.normalizrMod.schemaNs.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object normalizrMod {
  /* Rewritten from type alias, can be one of: 
    - typings.normalizr.normalizrMod.schemaNs.Array
    - typings.normalizr.normalizrMod.schemaNs.Entity
    - typings.normalizr.normalizrMod.schemaNs.Object
    - typings.normalizr.normalizrMod.schemaNs.Union
    - typings.normalizr.normalizrMod.schemaNs.Values
    - js.Array[
  typings.normalizr.normalizrMod.schemaNs.Array | typings.normalizr.normalizrMod.schemaNs.Entity | typings.normalizr.normalizrMod.schemaNs.Object | typings.normalizr.normalizrMod.schemaNs.Union | typings.normalizr.normalizrMod.schemaNs.Values]
    - org.scalablytyped.runtime.StringDictionary[
  (/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias normalizr.normalizr.Schema * / js.Object) | (js.Array[
    / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias normalizr.normalizr.Schema * / js.Object
  ])]
  */
  type Schema = _Schema | (js.Array[Array | Entity | Object | Union | Values]) | (StringDictionary[
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias normalizr.normalizr.Schema */ js.Object) | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias normalizr.normalizr.Schema */ js.Object
    ])
  ])
}
