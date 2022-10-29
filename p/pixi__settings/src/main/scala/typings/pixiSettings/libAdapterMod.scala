package typings.pixiSettings

import typings.pixiSettings.anon.TypeofWebGLRenderingConte
import typings.pixiSettings.anon.UserAgent
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.FontFaceSet
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdapterMod {
  
  @JSImport("@pixi/settings/lib/adapter", "BrowserAdapter")
  @js.native
  val BrowserAdapter: IAdapter = js.native
  
  @js.native
  trait IAdapter extends StObject {
    
    /** Returns a canvas object that can be used to create a webgl context. */
    def createCanvas(): ICanvas = js.native
    def createCanvas(width: Double): ICanvas = js.native
    def createCanvas(width: Double, height: Double): ICanvas = js.native
    def createCanvas(width: Unit, height: Double): ICanvas = js.native
    
    def fetch(url: RequestInfo): js.Promise[Response] = js.native
    def fetch(url: RequestInfo, options: RequestInit): js.Promise[Response] = js.native
    
    /** Returns the current base URL For browser environments this is either the document.baseURI or window.location.href */
    def getBaseUrl(): String = js.native
    
    def getFontFaceSet(): FontFaceSet | Null = js.native
    
    /** Returns a partial implementation of the browsers window.navigator */
    def getNavigator(): UserAgent = js.native
    
    /** Returns a webgl rendering context. */
    def getWebGLRenderingContext(): TypeofWebGLRenderingConte = js.native
  }
}
