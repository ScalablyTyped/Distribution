package typings.msportalfxMock

import typings.msportalfxMock.mockFxMod.MockFx.Context
import typings.msportalfxMock.mockFxMod.MockFx.Finalization
import typings.msportalfxMock.mockFxMod.MockFx.LogLevel
import typings.msportalfxMock.mockFxMod.MockFx.Stage
import typings.msportalfxMock.mockFxMod.MockFx.Telemetry
import typings.msportalfxMock.msportalfxMockStrings.addListener
import typings.msportalfxMock.msportalfxMockStrings.constructor
import typings.msportalfxMock.msportalfxMockStrings.debug
import typings.msportalfxMock.msportalfxMockStrings.emit
import typings.msportalfxMock.msportalfxMockStrings.error
import typings.msportalfxMock.msportalfxMockStrings.eventNames
import typings.msportalfxMock.msportalfxMockStrings.finalizeStage
import typings.msportalfxMock.msportalfxMockStrings.finalizeTest
import typings.msportalfxMock.msportalfxMockStrings.getMaxListeners
import typings.msportalfxMock.msportalfxMockStrings.info
import typings.msportalfxMock.msportalfxMockStrings.listenerCount
import typings.msportalfxMock.msportalfxMockStrings.listeners
import typings.msportalfxMock.msportalfxMockStrings.off
import typings.msportalfxMock.msportalfxMockStrings.on
import typings.msportalfxMock.msportalfxMockStrings.once
import typings.msportalfxMock.msportalfxMockStrings.prependListener
import typings.msportalfxMock.msportalfxMockStrings.prependOnceListener
import typings.msportalfxMock.msportalfxMockStrings.rawListeners
import typings.msportalfxMock.msportalfxMockStrings.registerStage
import typings.msportalfxMock.msportalfxMockStrings.registerTest
import typings.msportalfxMock.msportalfxMockStrings.removeAllListeners
import typings.msportalfxMock.msportalfxMockStrings.removeListener
import typings.msportalfxMock.msportalfxMockStrings.setMaxListeners
import typings.msportalfxMock.msportalfxMockStrings.telemetry
import typings.msportalfxMock.msportalfxMockStrings.warn
import typings.node.eventsMod.EventEmitter
import typings.std.Exclude
import typings.strictEventEmitterTypes.mod.OverriddenKeys
import typings.strictEventEmitterTypes.mod.StrictEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/logger", "logger")
  @js.native
  val logger: LoggerType = js.native
  
  @js.native
  trait Events extends StObject {
    
    def error(error: js.Error): Unit = js.native
    def error(error: js.Error, testContext: Context): Unit = js.native
    
    def finalizeStage(data: Stage): Unit = js.native
    
    def finalizeTest(data: Finalization): Unit = js.native
    
    def log(level: LogLevel, message: String): Unit = js.native
    def log(level: LogLevel, message: String, testContext: Context): Unit = js.native
    
    def registerStage(data: Stage): Unit = js.native
    
    def registerTest(data: Context): Unit = js.native
    
    def telemetry(telemetry: Telemetry): Unit = js.native
  }
  
  type LoggerType = StrictEventEmitter[
    Logger_, 
    Events, 
    Events, 
    Exclude[
      OverriddenKeys, 
      /* keyof msportalfx-mock.msportalfx-mock/lib/src/MockFx/logger.Logger */ debug | info | warn | error | telemetry | finalizeStage | finalizeTest | registerStage | registerTest | constructor | addListener | on | once | removeListener | off | removeAllListeners | setMaxListeners | getMaxListeners | listeners | rawListeners | emit | listenerCount | prependListener | prependOnceListener | eventNames
    ], 
    Exclude[
      OverriddenKeys, 
      Exclude[
        OverriddenKeys, 
        /* keyof msportalfx-mock.msportalfx-mock/lib/src/MockFx/logger.Logger */ debug | info | warn | error | telemetry | finalizeStage | finalizeTest | registerStage | registerTest | constructor | addListener | on | once | removeListener | off | removeAllListeners | setMaxListeners | getMaxListeners | listeners | rawListeners | emit | listenerCount | prependListener | prependOnceListener | eventNames
      ]
    ]
  ]
  
  @js.native
  trait Logger_ extends EventEmitter {
    
    def debug(message: String): Unit = js.native
    def debug(message: String, testContext: Context): Unit = js.native
    
    def error(error: js.Error): Unit = js.native
    def error(error: js.Error, testContext: Context): Unit = js.native
    
    def finalizeStage(data: Stage): Unit = js.native
    
    def finalizeTest(data: Finalization): Unit = js.native
    
    def info(message: String): Unit = js.native
    def info(message: String, testContext: Context): Unit = js.native
    
    def registerStage(data: Stage): Unit = js.native
    
    def registerTest(data: Context): Unit = js.native
    
    def telemetry(telemetry: Telemetry): Unit = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: String, testContext: Context): Unit = js.native
  }
}
