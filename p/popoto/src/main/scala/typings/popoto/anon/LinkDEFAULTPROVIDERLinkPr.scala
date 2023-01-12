package typings.popoto.anon

import typings.popoto.providerMod.Link
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined popoto.popoto/provider.Link & {  DEFAULT_PROVIDER :popoto.popoto/provider.Link,   Provider :popoto.popoto/provider.Link} */
trait LinkDEFAULTPROVIDERLinkPr extends StObject {
  
  /**
    * Label provider used by default if none have been defined for a label.
    * This provider can be changed if needed to customize default behavior.
    * If some properties are not found in user customized providers, default values will be extracted from this provider.
    */
  var DEFAULT_PROVIDER: Link
  
  var Provider: Link
  
  /**
    *
    * @param link
    * @param element
    * @return css class
    */
  def getCSSClass(link: Any, element: SVGGElement): String
  
  /**
    * Return the color to use on links and relation donut segments.
    *
    *
    * Return null or undefined
    * @param link
    * @param element
    * @param attribute
    * @return color
    */
  def getColor(link: Any, element: SVGGElement, attribute: String): String
  
  /**
    *
    * @param link
    */
  def getDistance(link: Any): Double
  
  /**
    *  Get the semantic text representation of a link.
    *
    * @param link the link to get the semantic text representation.
    * @returns the semantic text representation of the link.
    */
  def getSemanticValue(link: Any): String
  
  /**
    *  Get the text representation of a link.
    *
    * @param link the link to get the text representation.
    * @returns the text representation of the link.
    */
  def getTextValue(link: Any): String
}
object LinkDEFAULTPROVIDERLinkPr {
  
  inline def apply(
    DEFAULT_PROVIDER: Link,
    Provider: Link,
    getCSSClass: (Any, SVGGElement) => String,
    getColor: (Any, SVGGElement, String) => String,
    getDistance: Any => Double,
    getSemanticValue: Any => String,
    getTextValue: Any => String
  ): LinkDEFAULTPROVIDERLinkPr = {
    val __obj = js.Dynamic.literal(DEFAULT_PROVIDER = DEFAULT_PROVIDER.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], getCSSClass = js.Any.fromFunction2(getCSSClass), getColor = js.Any.fromFunction3(getColor), getDistance = js.Any.fromFunction1(getDistance), getSemanticValue = js.Any.fromFunction1(getSemanticValue), getTextValue = js.Any.fromFunction1(getTextValue))
    __obj.asInstanceOf[LinkDEFAULTPROVIDERLinkPr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkDEFAULTPROVIDERLinkPr] (val x: Self) extends AnyVal {
    
    inline def setDEFAULT_PROVIDER(value: Link): Self = StObject.set(x, "DEFAULT_PROVIDER", value.asInstanceOf[js.Any])
    
    inline def setGetCSSClass(value: (Any, SVGGElement) => String): Self = StObject.set(x, "getCSSClass", js.Any.fromFunction2(value))
    
    inline def setGetColor(value: (Any, SVGGElement, String) => String): Self = StObject.set(x, "getColor", js.Any.fromFunction3(value))
    
    inline def setGetDistance(value: Any => Double): Self = StObject.set(x, "getDistance", js.Any.fromFunction1(value))
    
    inline def setGetSemanticValue(value: Any => String): Self = StObject.set(x, "getSemanticValue", js.Any.fromFunction1(value))
    
    inline def setGetTextValue(value: Any => String): Self = StObject.set(x, "getTextValue", js.Any.fromFunction1(value))
    
    inline def setProvider(value: Link): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
