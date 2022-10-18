package typings.nextSeo.libTypesMod

import typings.nextSeo.nextSeoStrings.`content-security-policy`
import typings.nextSeo.nextSeoStrings.`content-type`
import typings.nextSeo.nextSeoStrings.`default-style`
import typings.nextSeo.nextSeoStrings.`x-ua-compatible`
import typings.nextSeo.nextSeoStrings.refresh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nextSeo.libTypesMod.HTML5MetaTag
  - typings.nextSeo.libTypesMod.RDFaMetaTag
  - typings.nextSeo.libTypesMod.HTTPEquivMetaTag
*/
trait MetaTag extends StObject
object MetaTag {
  
  inline def HTML5MetaTag(content: String, httpEquiv: Unit, name: String, property: Unit): typings.nextSeo.libTypesMod.HTML5MetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nextSeo.libTypesMod.HTML5MetaTag]
  }
  
  inline def HTTPEquivMetaTag(
    content: String,
    httpEquiv: `content-security-policy` | `content-type` | `default-style` | `x-ua-compatible` | refresh,
    name: Unit,
    property: Unit
  ): typings.nextSeo.libTypesMod.HTTPEquivMetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nextSeo.libTypesMod.HTTPEquivMetaTag]
  }
  
  inline def RDFaMetaTag(content: String, httpEquiv: Unit, name: Unit, property: String): typings.nextSeo.libTypesMod.RDFaMetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nextSeo.libTypesMod.RDFaMetaTag]
  }
}
