package typings.postgres.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Iterable because var conflicts: iterator. Inlined  */ @js.native
trait RawRowList[T /* <: js.Array[Any] */]
  extends StObject
     with Array[js.Array[Buffer]]
     with ResultQueryMeta[
      /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T[number] */ js.Any
    ]
