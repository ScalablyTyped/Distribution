package typings.msportalfxMock

import typings.msportalfxMock.libSrcMockFxMod.MockFx.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxTargetsHelpersMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/targets/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logErrorIfRequestsDifferOnlyInApiVersion(url1: String, url2: String, partialMessage: String, context: Context): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logErrorIfRequestsDifferOnlyInApiVersion")(url1.asInstanceOf[js.Any], url2.asInstanceOf[js.Any], partialMessage.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def urlsAreSameApartFromApiVersion(url1: String, url2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("urlsAreSameApartFromApiVersion")(url1.asInstanceOf[js.Any], url2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
