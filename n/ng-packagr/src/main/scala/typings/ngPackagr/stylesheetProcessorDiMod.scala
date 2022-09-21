package typings.ngPackagr

import typings.injectionJs.mod.InjectionToken
import typings.injectionJs.providerMod.FactoryProvider
import typings.ngPackagr.stylesheetProcessorMod.StylesheetProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesheetProcessorDiMod {
  
  @JSImport("ng-packagr/lib/styles/stylesheet-processor.di", "STYLESHEET_PROCESSOR")
  @js.native
  val STYLESHEET_PROCESSOR: FactoryProvider = js.native
  
  @JSImport("ng-packagr/lib/styles/stylesheet-processor.di", "STYLESHEET_PROCESSOR_TOKEN")
  @js.native
  val STYLESHEET_PROCESSOR_TOKEN: InjectionToken[StylesheetProcessor] = js.native
}
