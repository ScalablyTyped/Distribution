package typings.normalizeScrollLeft

import typings.normalizeScrollLeft.normalizeScrollLeftStrings.ltr
import typings.normalizeScrollLeft.normalizeScrollLeftStrings.rtl
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("normalize-scroll-left", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectScrollType(): ScrollType = ^.asInstanceOf[js.Dynamic].applyDynamic("detectScrollType")().asInstanceOf[ScrollType]
  
  inline def getNormalizedScrollLeft_ltr(element: HTMLElement, direction: ltr): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedScrollLeft")(element.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNormalizedScrollLeft_rtl(element: HTMLElement, direction: rtl): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedScrollLeft")(element.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setNormalizedScrollLeft_ltr(element: HTMLElement, scrollLeft: Double, direction: ltr): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNormalizedScrollLeft")(element.asInstanceOf[js.Any], scrollLeft.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setNormalizedScrollLeft_rtl(element: HTMLElement, scrollLeft: Double, direction: rtl): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNormalizedScrollLeft")(element.asInstanceOf[js.Any], scrollLeft.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setScrollType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setScrollType")().asInstanceOf[Unit]
  inline def setScrollType(`type`: ScrollType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setScrollType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate
    - typings.normalizeScrollLeft.normalizeScrollLeftStrings.default
    - typings.normalizeScrollLeft.normalizeScrollLeftStrings.negative
    - typings.normalizeScrollLeft.normalizeScrollLeftStrings.reverse
  */
  trait ScrollType extends StObject
  object ScrollType {
    
    inline def default: typings.normalizeScrollLeft.normalizeScrollLeftStrings.default = "default".asInstanceOf[typings.normalizeScrollLeft.normalizeScrollLeftStrings.default]
    
    inline def indeterminate: typings.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate = "indeterminate".asInstanceOf[typings.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate]
    
    inline def negative: typings.normalizeScrollLeft.normalizeScrollLeftStrings.negative = "negative".asInstanceOf[typings.normalizeScrollLeft.normalizeScrollLeftStrings.negative]
    
    inline def reverse: typings.normalizeScrollLeft.normalizeScrollLeftStrings.reverse = "reverse".asInstanceOf[typings.normalizeScrollLeft.normalizeScrollLeftStrings.reverse]
  }
}
