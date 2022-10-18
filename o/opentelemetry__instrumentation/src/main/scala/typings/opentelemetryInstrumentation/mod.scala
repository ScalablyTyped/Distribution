package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.buildSrcPlatformNodeTypesMod.InstrumentationModuleFile
import typings.opentelemetryInstrumentation.buildSrcTypesInternalMod.AutoLoaderOptions
import typings.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/instrumentation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@opentelemetry/instrumentation", "InstrumentationBase")
  @js.native
  open class InstrumentationBase[T] protected ()
    extends typings.opentelemetryInstrumentation.buildSrcPlatformMod.InstrumentationBase[T] {
    def this(instrumentationName: String, instrumentationVersion: String) = this()
    def this(instrumentationName: String, instrumentationVersion: String, config: InstrumentationConfig) = this()
  }
  
  @JSImport("@opentelemetry/instrumentation", "InstrumentationNodeModuleDefinition")
  @js.native
  open class InstrumentationNodeModuleDefinition[T] protected ()
    extends typings.opentelemetryInstrumentation.buildSrcPlatformMod.InstrumentationNodeModuleDefinition[T] {
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
  
  @JSImport("@opentelemetry/instrumentation", "InstrumentationNodeModuleFile")
  @js.native
  open class InstrumentationNodeModuleFile[T] protected ()
    extends typings.opentelemetryInstrumentation.buildSrcPlatformMod.InstrumentationNodeModuleFile[T] {
    def this(
      name: String,
      supportedVersions: js.Array[String],
      patch: js.Function2[/* moduleExports */ T, /* moduleVersion */ js.UndefOr[String], T],
      unpatch: js.Function2[/* moduleExports */ js.UndefOr[T], /* moduleVersion */ js.UndefOr[String], Unit]
    ) = this()
  }
  
  inline def isWrapped(func: Any): /* is @opentelemetry/instrumentation.@opentelemetry/instrumentation/build/src/types.ShimWrapped */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWrapped")(func.asInstanceOf[js.Any]).asInstanceOf[/* is @opentelemetry/instrumentation.@opentelemetry/instrumentation/build/src/types.ShimWrapped */ Boolean]
  
  inline def registerInstrumentations(options: AutoLoaderOptions): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInstrumentations")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def safeExecuteInTheMiddle[T](
    execute: js.Function0[T],
    onFinish: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("safeExecuteInTheMiddle")(execute.asInstanceOf[js.Any], onFinish.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def safeExecuteInTheMiddle[T](
    execute: js.Function0[T],
    onFinish: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit],
    preventThrowingError: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("safeExecuteInTheMiddle")(execute.asInstanceOf[js.Any], onFinish.asInstanceOf[js.Any], preventThrowingError.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def safeExecuteInTheMiddleAsync[T](
    execute: js.Function0[T],
    onFinish: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeExecuteInTheMiddleAsync")(execute.asInstanceOf[js.Any], onFinish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def safeExecuteInTheMiddleAsync[T](
    execute: js.Function0[T],
    onFinish: js.Function2[/* e */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit],
    preventThrowingError: Boolean
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeExecuteInTheMiddleAsync")(execute.asInstanceOf[js.Any], onFinish.asInstanceOf[js.Any], preventThrowingError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
