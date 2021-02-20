package typings.normalizeScrollLeft

import typings.normalizeScrollLeft.normalizeScrollLeftStrings.ltr
import typings.normalizeScrollLeft.normalizeScrollLeftStrings.rtl
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("normalize-scroll-left", "detectScrollType")
  @js.native
  def detectScrollType(): ScrollType = js.native
  
  @JSImport("normalize-scroll-left", "getNormalizedScrollLeft")
  @js.native
  def getNormalizedScrollLeft_ltr(element: HTMLElement, direction: ltr): Double = js.native
  @JSImport("normalize-scroll-left", "getNormalizedScrollLeft")
  @js.native
  def getNormalizedScrollLeft_rtl(element: HTMLElement, direction: rtl): Double = js.native
  
  @JSImport("normalize-scroll-left", "setNormalizedScrollLeft")
  @js.native
  def setNormalizedScrollLeft_ltr(element: HTMLElement, scrollLeft: Double, direction: ltr): Unit = js.native
  @JSImport("normalize-scroll-left", "setNormalizedScrollLeft")
  @js.native
  def setNormalizedScrollLeft_rtl(element: HTMLElement, scrollLeft: Double, direction: rtl): Unit = js.native
  
  @JSImport("normalize-scroll-left", "_setScrollType")
  @js.native
  def setScrollType(): Unit = js.native
  @JSImport("normalize-scroll-left", "_setScrollType")
  @js.native
  def setScrollType(`type`: ScrollType): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate
    - typings.normalizeScrollLeft.normalizeScrollLeftStrings.default
    - typings.normalizeScrollLeft.normalizeScrollLeftStrings.negative
    - typings.normalizeScrollLeft.normalizeScrollLeftStrings.reverse
  */
  trait ScrollType extends StObject
  object ScrollType {
    
    @scala.inline
    def default: typings.normalizeScrollLeft.normalizeScrollLeftStrings.default = "default".asInstanceOf[typings.normalizeScrollLeft.normalizeScrollLeftStrings.default]
    
    @scala.inline
    def indeterminate: typings.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate = "indeterminate".asInstanceOf[typings.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate]
    
    @scala.inline
    def negative: typings.normalizeScrollLeft.normalizeScrollLeftStrings.negative = "negative".asInstanceOf[typings.normalizeScrollLeft.normalizeScrollLeftStrings.negative]
    
    @scala.inline
    def reverse: typings.normalizeScrollLeft.normalizeScrollLeftStrings.reverse = "reverse".asInstanceOf[typings.normalizeScrollLeft.normalizeScrollLeftStrings.reverse]
  }
}
