package typings.openui5.anon

import typings.openui5.sapUxapObjectPageSectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  /**
    * The section which the layout is scrolled to.
    */
  var section: js.UndefOr[default] = js.undefined
  
  /**
    * The subsection which the layout is scrolled to.
    */
  var subSection: js.UndefOr[typings.openui5.sapUxapObjectPageSubSectionMod.default] = js.undefined
}
object Section {
  
  inline def apply(): Section = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    inline def setSection(value: default): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSubSection(value: typings.openui5.sapUxapObjectPageSubSectionMod.default): Self = StObject.set(x, "subSection", value.asInstanceOf[js.Any])
    
    inline def setSubSectionUndefined: Self = StObject.set(x, "subSection", js.undefined)
  }
}
