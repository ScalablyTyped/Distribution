package typings.nginstackEngine

import typings.nginstackEngine.connectionConnectionMod.^
import typings.nginstackEngine.vendorMod.ThemeColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nginstack/engine/context", "connection")
  @js.native
  val connection: ^ = js.native
  
  @JSImport("@nginstack/engine/context", "database")
  @js.native
  val database: typings.nginstackEngine.databaseDatabaseMod.^ = js.native
  
  @JSImport("@nginstack/engine/context", "dbCache")
  @js.native
  val dbCache: typings.nginstackEngine.databaseDbcacheMod.^ = js.native
  
  @JSImport("@nginstack/engine/context", "engine")
  @js.native
  val engine: typings.nginstackEngine.engineEngineMod.^ = js.native
  
  @JSImport("@nginstack/engine/context", "request")
  @js.native
  val request: typings.nginstackEngine.httpRequestMod.^ = js.native
  
  @JSImport("@nginstack/engine/context", "response")
  @js.native
  val response: typings.nginstackEngine.httpResponseMod.^ = js.native
  
  @JSImport("@nginstack/engine/context", "session")
  @js.native
  val session: typings.nginstackEngine.sessionSessionMod.^ = js.native
  
  @JSImport("@nginstack/engine/context", "tempDB")
  @js.native
  val tempDB: typings.nginstackEngine.idoDBMod.^ = js.native
  
  object vendor {
    
    @JSImport("@nginstack/engine/context", "vendor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nginstack/engine/context", "vendor.colors")
    @js.native
    def colors: ThemeColors = js.native
    inline def colors_=(x: ThemeColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.faviconUrl")
    @js.native
    def faviconUrl: String = js.native
    inline def faviconUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.footerLogoTitle")
    @js.native
    def footerLogoTitle: String = js.native
    inline def footerLogoTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footerLogoTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.footerLogoUrl")
    @js.native
    def footerLogoUrl: String | Double = js.native
    inline def footerLogoUrl_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footerLogoUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.legalName")
    @js.native
    def legalName: String = js.native
    inline def legalName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legalName")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.logoTitle")
    @js.native
    def logoTitle: String = js.native
    inline def logoTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.logoUrl")
    @js.native
    def logoUrl: String | Double = js.native
    inline def logoUrl_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.mainMenuLogoUrl")
    @js.native
    def mainMenuLogoUrl: String = js.native
    inline def mainMenuLogoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainMenuLogoUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.siteUrl")
    @js.native
    def siteUrl: String = js.native
    inline def siteUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("siteUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("@nginstack/engine/context", "vendor.systemName")
    @js.native
    def systemName: String = js.native
    inline def systemName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemName")(x.asInstanceOf[js.Any])
  }
}
