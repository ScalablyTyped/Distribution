package typings.nextSeo

import typings.nextSeo.anon.LogoName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetPublisherMod {
  
  @JSImport("next-seo/lib/utils/schema/setPublisher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setPublisher(): js.UndefOr[LogoName] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPublisher")().asInstanceOf[js.UndefOr[LogoName]]
  inline def setPublisher(publisherName: String): js.UndefOr[LogoName] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPublisher")(publisherName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[LogoName]]
  inline def setPublisher(publisherName: String, publisherLogo: String): js.UndefOr[LogoName] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPublisher")(publisherName.asInstanceOf[js.Any], publisherLogo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[LogoName]]
  inline def setPublisher(publisherName: Unit, publisherLogo: String): js.UndefOr[LogoName] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPublisher")(publisherName.asInstanceOf[js.Any], publisherLogo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[LogoName]]
}
