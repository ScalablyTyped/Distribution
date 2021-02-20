package typings.opentelemetryCore

import typings.opentelemetryCore.anon.FetchStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@opentelemetry/core/build/src/common/types", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    @js.native
    sealed trait DEBUG extends LogLevel
    /* 3 */ val DEBUG: typings.opentelemetryCore.typesMod.LogLevel.DEBUG with Double = js.native
    
    @js.native
    sealed trait ERROR extends LogLevel
    /* 0 */ val ERROR: typings.opentelemetryCore.typesMod.LogLevel.ERROR with Double = js.native
    
    @js.native
    sealed trait INFO extends LogLevel
    /* 2 */ val INFO: typings.opentelemetryCore.typesMod.LogLevel.INFO with Double = js.native
    
    @js.native
    sealed trait WARN extends LogLevel
    /* 1 */ val WARN: typings.opentelemetryCore.typesMod.LogLevel.WARN with Double = js.native
  }
  
  @js.native
  trait InstrumentationLibrary extends StObject {
    
    val name: String = js.native
    
    val version: String = js.native
  }
  object InstrumentationLibrary {
    
    @scala.inline
    def apply(name: String, version: String): InstrumentationLibrary = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumentationLibrary]
    }
    
    @scala.inline
    implicit class InstrumentationLibraryMutableBuilder[Self <: InstrumentationLibrary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type LogLevelString = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any */ String
  
  @js.native
  trait ShimWrapped extends StObject {
    
    var __original: js.Function = js.native
    
    var __unwrap: js.Function = js.native
    
    var __wrapped: Boolean = js.native
  }
  object ShimWrapped {
    
    @scala.inline
    def apply(__original: js.Function, __unwrap: js.Function, __wrapped: Boolean): ShimWrapped = {
      val __obj = js.Dynamic.literal(__original = __original.asInstanceOf[js.Any], __unwrap = __unwrap.asInstanceOf[js.Any], __wrapped = __wrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShimWrapped]
    }
    
    @scala.inline
    implicit class ShimWrappedMutableBuilder[Self <: ShimWrapped] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__original(value: js.Function): Self = StObject.set(x, "__original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__unwrap(value: js.Function): Self = StObject.set(x, "__unwrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__wrapped(value: Boolean): Self = StObject.set(x, "__wrapped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimeOriginLegacy extends StObject {
    
    var timing: FetchStart = js.native
  }
  object TimeOriginLegacy {
    
    @scala.inline
    def apply(timing: FetchStart): TimeOriginLegacy = {
      val __obj = js.Dynamic.literal(timing = timing.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeOriginLegacy]
    }
    
    @scala.inline
    implicit class TimeOriginLegacyMutableBuilder[Self <: TimeOriginLegacy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTiming(value: FetchStart): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    }
  }
}
