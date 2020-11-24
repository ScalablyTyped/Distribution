package typings.opentelemetrySemanticConventions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/semantic-conventions/build/src/trace/os", JSImport.Namespace)
@js.native
object osMod extends js.Object {
  
  @js.native
  object OperatingSystem extends js.Object {
    
    /**
      * Human readable (not intended to be parsed) OS version information.
      * E.g., "Microsoft Windows [Version 10.0.18363.778]"
      *
      * @remarks
      * Required if applicable.
      */
    var DESCRIPTION: String = js.native
    
    /**
      * The operating system type.
      * This should be set to one of {@link OperatingSystemValues}
      * E.g., "WINDOWS"
      *
      * @remarks
      * Required.
      */
    var TYPE: String = js.native
  }
  
  @js.native
  object OperatingSystemValues extends js.Object {
    
    var AIX: String = js.native
    
    var DARWIN: String = js.native
    
    var DRAGONFLYBSD: String = js.native
    
    var FREEBSD: String = js.native
    
    var HPUX: String = js.native
    
    var LINUX: String = js.native
    
    var NETBSD: String = js.native
    
    var OPENBSD: String = js.native
    
    var SOLARIS: String = js.native
    
    var WINDOWS: String = js.native
    
    var ZOS: String = js.native
  }
}
