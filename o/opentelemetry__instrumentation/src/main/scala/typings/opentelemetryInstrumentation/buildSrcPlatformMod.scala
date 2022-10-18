package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.buildSrcPlatformNodeTypesMod.InstrumentationModuleFile
import typings.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformMod {
  
  /* note: abstract class */ @JSImport("@opentelemetry/instrumentation/build/src/platform", "InstrumentationBase")
  @js.native
  open class InstrumentationBase[T] protected ()
    extends typings.opentelemetryInstrumentation.buildSrcPlatformNodeMod.InstrumentationBase[T] {
    def this(instrumentationName: String, instrumentationVersion: String) = this()
    def this(instrumentationName: String, instrumentationVersion: String, config: InstrumentationConfig) = this()
  }
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform", "InstrumentationNodeModuleDefinition")
  @js.native
  open class InstrumentationNodeModuleDefinition[T] protected ()
    extends typings.opentelemetryInstrumentation.buildSrcPlatformNodeMod.InstrumentationNodeModuleDefinition[T] {
    def this(name: String, supportedVersions: js.Array[String]) = this()
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: js.Function2[/* exports */ T, /* moduleVersion */ js.UndefOr[String], T]
    ) = this()
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: js.Function2[/* exports */ T, /* moduleVersion */ js.UndefOr[String], T],
      unpatch: js.Function2[/* exports */ T, /* moduleVersion */ js.UndefOr[String], Unit]
    ) = this()
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: Unit,
      unpatch: js.Function2[/* exports */ T, /* moduleVersion */ js.UndefOr[String], Unit]
    ) = this()
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: js.Function2[/* exports */ T, /* moduleVersion */ js.UndefOr[String], T],
      unpatch: js.Function2[/* exports */ T, /* moduleVersion */ js.UndefOr[String], Unit],
      files: js.Array[InstrumentationModuleFile[Any]]
    ) = this()
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: js.Function2[/* exports */ T, /* moduleVersion */ js.UndefOr[String], T],
      unpatch: Unit,
      files: js.Array[InstrumentationModuleFile[Any]]
    ) = this()
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: Unit,
      unpatch: js.Function2[/* exports */ T, /* moduleVersion */ js.UndefOr[String], Unit],
      files: js.Array[InstrumentationModuleFile[Any]]
    ) = this()
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: Unit,
      unpatch: Unit,
      files: js.Array[InstrumentationModuleFile[Any]]
    ) = this()
  }
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform", "InstrumentationNodeModuleFile")
  @js.native
  open class InstrumentationNodeModuleFile[T] protected ()
    extends typings.opentelemetryInstrumentation.buildSrcPlatformNodeMod.InstrumentationNodeModuleFile[T] {
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: js.Function2[/* moduleExports */ T, /* moduleVersion */ js.UndefOr[String], T],
      unpatch: js.Function2[/* moduleExports */ js.UndefOr[T], /* moduleVersion */ js.UndefOr[String], Unit]
    ) = this()
  }
}
