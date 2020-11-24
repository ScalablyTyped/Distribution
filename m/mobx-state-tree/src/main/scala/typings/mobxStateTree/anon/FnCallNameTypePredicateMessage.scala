package typings.mobxStateTree.anon

import typings.mobxStateTree.typeMod.IAnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallNameTypePredicateMessage extends js.Object {
  
  def apply[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ]
  ): IT = js.native
  def apply[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: String
  ): IT = js.native
  def apply[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
      String
    ]
  ): IT = js.native
  def apply[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ]
  ): IT = js.native
  def apply[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: String
  ): IT = js.native
  def apply[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
      String
    ]
  ): IT = js.native
}
