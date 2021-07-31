package typings.openui5.global.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeBindingUtils {
  
  @JSGlobal("sap.ui.model.TreeBindingUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Merges together oNewSection into a set of other sections (aSections)The array/objects are not
    * modified, the function returns a new section array.
    * @param aSections the sections into which oNewSection will be merged
    * @param oNewSection the section which should be merged into aNewSections
    * @returns a new array containing all sections from aSections merged with oNewSection
    */
  @scala.inline
  def mergeSections(aSections: js.Array[js.Any], oNewSection: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeSections")(aSections.asInstanceOf[js.Any], oNewSection.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}
