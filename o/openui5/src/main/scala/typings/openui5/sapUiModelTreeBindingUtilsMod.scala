package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTreeBindingUtilsMod extends Shortcut {
  
  @JSImport("sap/ui/model/TreeBindingUtils", JSImport.Default)
  @js.native
  val default: TreeBindingUtils = js.native
  
  trait TreeBindingUtils extends StObject {
    
    /**
      * Merges together oNewSection into a set of other sections (aSections) The array/objects are not modified,
      * the function returns a new section array.
      *
      * @returns a new array containing all sections from aSections merged with oNewSection
      */
    def mergeSections(
      /**
      * the sections into which oNewSection will be merged
      */
    aSections: js.Array[js.Object],
      /**
      * the section which should be merged into aNewSections
      */
    oNewSection: js.Object
    ): js.Array[js.Object]
  }
  object TreeBindingUtils {
    
    inline def apply(mergeSections: (js.Array[js.Object], js.Object) => js.Array[js.Object]): TreeBindingUtils = {
      val __obj = js.Dynamic.literal(mergeSections = js.Any.fromFunction2(mergeSections))
      __obj.asInstanceOf[TreeBindingUtils]
    }
    
    extension [Self <: TreeBindingUtils](x: Self) {
      
      inline def setMergeSections(value: (js.Array[js.Object], js.Object) => js.Array[js.Object]): Self = StObject.set(x, "mergeSections", js.Any.fromFunction2(value))
    }
  }
  
  type _To = TreeBindingUtils
  
  /* This means you don't have to write `default`, but can instead just say `sapUiModelTreeBindingUtilsMod.foo` */
  override def _to: TreeBindingUtils = default
}
