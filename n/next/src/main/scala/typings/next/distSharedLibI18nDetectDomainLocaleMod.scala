package typings.next

import typings.next.distServerConfigSharedMod.DomainLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibI18nDetectDomainLocaleMod {
  
  @JSImport("next/dist/shared/lib/i18n/detect-domain-locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectDomainLocale(): js.UndefOr[DomainLocale] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectDomainLocale")().asInstanceOf[js.UndefOr[DomainLocale]]
  inline def detectDomainLocale(domainItems: js.Array[DomainLocale]): js.UndefOr[DomainLocale] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectDomainLocale")(domainItems.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DomainLocale]]
  inline def detectDomainLocale(domainItems: js.Array[DomainLocale], hostname: String): js.UndefOr[DomainLocale] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectDomainLocale")(domainItems.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DomainLocale]]
  inline def detectDomainLocale(domainItems: js.Array[DomainLocale], hostname: String, detectedLocale: String): js.UndefOr[DomainLocale] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectDomainLocale")(domainItems.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any], detectedLocale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DomainLocale]]
  inline def detectDomainLocale(domainItems: js.Array[DomainLocale], hostname: Unit, detectedLocale: String): js.UndefOr[DomainLocale] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectDomainLocale")(domainItems.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any], detectedLocale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DomainLocale]]
  inline def detectDomainLocale(domainItems: Unit, hostname: String): js.UndefOr[DomainLocale] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectDomainLocale")(domainItems.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DomainLocale]]
  inline def detectDomainLocale(domainItems: Unit, hostname: String, detectedLocale: String): js.UndefOr[DomainLocale] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectDomainLocale")(domainItems.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any], detectedLocale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DomainLocale]]
  inline def detectDomainLocale(domainItems: Unit, hostname: Unit, detectedLocale: String): js.UndefOr[DomainLocale] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectDomainLocale")(domainItems.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any], detectedLocale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DomainLocale]]
}
