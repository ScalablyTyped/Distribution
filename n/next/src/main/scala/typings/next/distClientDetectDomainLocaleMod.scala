package typings.next

import typings.next.distServerConfigSharedMod.DomainLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientDetectDomainLocaleMod {
  
  @JSImport("next/dist/client/detect-domain-locale", "detectDomainLocale")
  @js.native
  val detectDomainLocale: js.Function3[
    /* domainItems */ js.UndefOr[js.Array[DomainLocale]], 
    /* hostname */ js.UndefOr[String], 
    /* detectedLocale */ js.UndefOr[String], 
    js.UndefOr[DomainLocale]
  ] = js.native
}
