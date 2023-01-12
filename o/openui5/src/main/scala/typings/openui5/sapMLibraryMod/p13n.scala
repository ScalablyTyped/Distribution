package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object p13n {
  
  /**
    * @SINCE 1.97
    * @EXPERIMENTAL
    *
    * Interface for P13nPopup which are suitable as content for the `sap.m.p13n.Popup`. Implementation of this
    * interface should include the following methods:
    * 	 - `getTitle`
    */
  trait IContent extends StObject {
    
    var __implements__sap_m_p13n_IContent: Boolean
    
    /**
      * @EXPERIMENTAL
      *
      * Returns the title, which should be displayed in the P13nPopup to describe related content.
      *
      * @returns The title for the corresponding content to be displayed in the `sap.m.p13n.Popup`.
      */
    def getTitle(): String
  }
  object IContent {
    
    inline def apply(__implements__sap_m_p13n_IContent: Boolean, getTitle: () => String): IContent = {
      val __obj = js.Dynamic.literal(__implements__sap_m_p13n_IContent = __implements__sap_m_p13n_IContent.asInstanceOf[js.Any], getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[IContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IContent] (val x: Self) extends AnyVal {
      
      inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def set__implements__sap_m_p13n_IContent(value: Boolean): Self = StObject.set(x, "__implements__sap_m_p13n_IContent", value.asInstanceOf[js.Any])
    }
  }
}
