package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.buildSrcPlatformNodeTypesMod.InstrumentationModuleFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeInstrumentationNodeModuleFileMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform/node/instrumentationNodeModuleFile", "InstrumentationNodeModuleFile")
  @js.native
  open class InstrumentationNodeModuleFile[T] protected ()
    extends StObject
       with InstrumentationModuleFile[T] {
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: js.Function2[/* moduleExports */ T, /* moduleVersion */ js.UndefOr[String], T],
      unpatch: js.Function2[/* moduleExports */ js.UndefOr[T], /* moduleVersion */ js.UndefOr[String], Unit]
    ) = this()
  }
}
