package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IAnyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refinementMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/refinement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isRefinementType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefinementType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  @scala.inline
  def refinement_CreationType[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ]
  ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[IT]
  @scala.inline
  def refinement_CreationType[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: String
  ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IT]
  @scala.inline
  def refinement_CreationType[IT /* <: IAnyType */](
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
  ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IT]
  @scala.inline
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ]
  ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[IT]
  @scala.inline
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: String
  ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IT]
  @scala.inline
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
      String
    ]
  ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IT]
}
