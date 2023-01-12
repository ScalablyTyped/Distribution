package typings.popoto.anon

import typings.popoto.providerMod.Taxonomy
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined popoto.popoto/provider.Taxonomy & {  DEFAULT_PROVIDER :popoto.popoto/provider.Taxonomy,   Provider :popoto.popoto/provider.Taxonomy} */
trait TaxonomyDEFAULTPROVIDERTa extends StObject {
  
  /**
    * Label provider used by default if none have been defined for a label.
    * This provider can be changed if needed to customize default behavior.
    * If some properties are not found in user customized providers, default values will be extracted from this provider.
    */
  var DEFAULT_PROVIDER: Taxonomy
  
  var Provider: Taxonomy
  
  /**
    *
    * @param label
    * @param element
    * @return css class
    */
  def getCSSClass(label: String, element: SVGGElement): String
  
  /**
    *  Get the text representation of a taxonomy.
    *
    * @param label the label used for the taxonomy.
    * @returns the text representation of the taxonomy.
    */
  def getTextValue(label: String): String
}
object TaxonomyDEFAULTPROVIDERTa {
  
  inline def apply(
    DEFAULT_PROVIDER: Taxonomy,
    Provider: Taxonomy,
    getCSSClass: (String, SVGGElement) => String,
    getTextValue: String => String
  ): TaxonomyDEFAULTPROVIDERTa = {
    val __obj = js.Dynamic.literal(DEFAULT_PROVIDER = DEFAULT_PROVIDER.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], getCSSClass = js.Any.fromFunction2(getCSSClass), getTextValue = js.Any.fromFunction1(getTextValue))
    __obj.asInstanceOf[TaxonomyDEFAULTPROVIDERTa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaxonomyDEFAULTPROVIDERTa] (val x: Self) extends AnyVal {
    
    inline def setDEFAULT_PROVIDER(value: Taxonomy): Self = StObject.set(x, "DEFAULT_PROVIDER", value.asInstanceOf[js.Any])
    
    inline def setGetCSSClass(value: (String, SVGGElement) => String): Self = StObject.set(x, "getCSSClass", js.Any.fromFunction2(value))
    
    inline def setGetTextValue(value: String => String): Self = StObject.set(x, "getTextValue", js.Any.fromFunction1(value))
    
    inline def setProvider(value: Taxonomy): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
