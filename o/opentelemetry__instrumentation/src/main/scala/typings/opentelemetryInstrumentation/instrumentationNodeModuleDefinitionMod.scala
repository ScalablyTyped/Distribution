package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.typesMod.InstrumentationModuleDefinition
import typings.opentelemetryInstrumentation.typesMod.InstrumentationModuleFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instrumentationNodeModuleDefinitionMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform/node/instrumentationNodeModuleDefinition", "InstrumentationNodeModuleDefinition")
  @js.native
  open class InstrumentationNodeModuleDefinition[T] protected ()
    extends StObject
       with InstrumentationModuleDefinition[T] {
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
    
    /** Module internal files to be patched  */
    /* CompleteClass */
    var files: js.Array[InstrumentationModuleFile[Any]] = js.native
    @JSName("files")
    var files_InstrumentationNodeModuleDefinition: js.Array[InstrumentationModuleFile[T]] = js.native
    
    /** Module name or path  */
    /* CompleteClass */
    var name: String = js.native
    
    /** Supported version of module  */
    /* CompleteClass */
    var supportedVersions: js.Array[String] = js.native
  }
}
