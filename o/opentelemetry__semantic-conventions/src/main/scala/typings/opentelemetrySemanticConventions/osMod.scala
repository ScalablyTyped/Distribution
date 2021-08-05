package typings.opentelemetrySemanticConventions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osMod {
  
  object OperatingSystem {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Human readable (not intended to be parsed) OS version information.
      * E.g., "Microsoft Windows [Version 10.0.18363.778]"
      *
      * @remarks
      * Required if applicable.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystem.DESCRIPTION")
    @js.native
    def DESCRIPTION: String = js.native
    inline def DESCRIPTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESCRIPTION")(x.asInstanceOf[js.Any])
    
    /**
      * The operating system type.
      * This should be set to one of {@link OperatingSystemValues}
      * E.g., "WINDOWS"
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystem.TYPE")
    @js.native
    def TYPE: String = js.native
    inline def TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
  }
  
  object OperatingSystemValues {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.AIX")
    @js.native
    def AIX: String = js.native
    inline def AIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AIX")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.DARWIN")
    @js.native
    def DARWIN: String = js.native
    inline def DARWIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARWIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.DRAGONFLYBSD")
    @js.native
    def DRAGONFLYBSD: String = js.native
    inline def DRAGONFLYBSD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAGONFLYBSD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.FREEBSD")
    @js.native
    def FREEBSD: String = js.native
    inline def FREEBSD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FREEBSD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.HPUX")
    @js.native
    def HPUX: String = js.native
    inline def HPUX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HPUX")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.LINUX")
    @js.native
    def LINUX: String = js.native
    inline def LINUX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.NETBSD")
    @js.native
    def NETBSD: String = js.native
    inline def NETBSD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETBSD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.OPENBSD")
    @js.native
    def OPENBSD: String = js.native
    inline def OPENBSD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENBSD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.SOLARIS")
    @js.native
    def SOLARIS: String = js.native
    inline def SOLARIS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOLARIS")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.WINDOWS")
    @js.native
    def WINDOWS: String = js.native
    inline def WINDOWS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", "OperatingSystemValues.ZOS")
    @js.native
    def ZOS: String = js.native
    inline def ZOS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZOS")(x.asInstanceOf[js.Any])
  }
}
