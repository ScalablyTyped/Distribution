package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AndroidTheme extends StObject
@JSGlobal("ngCordova.AndroidTheme")
@js.native
object AndroidTheme extends StObject {
  
  @js.native
  sealed trait DeviceDefaultDark
    extends StObject
       with AndroidTheme
  
  @js.native
  sealed trait DeviceDefaultLight
    extends StObject
       with AndroidTheme
  
  @js.native
  sealed trait HoloDark
    extends StObject
       with AndroidTheme
  
  @js.native
  sealed trait HoloLight
    extends StObject
       with AndroidTheme
  
  @js.native
  sealed trait Traditional
    extends StObject
       with AndroidTheme
}
