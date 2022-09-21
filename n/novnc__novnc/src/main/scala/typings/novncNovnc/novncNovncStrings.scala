package typings.novncNovnc

import typings.novncNovnc.rfbMod.NoVncEvent
import typings.novncNovnc.rfbMod.NoVncEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object novncNovncStrings {
  
  @js.native
  sealed trait bell
    extends StObject
       with NoVncEventType
  inline def bell: bell = "bell".asInstanceOf[bell]
  
  @js.native
  sealed trait capabilities
    extends StObject
       with NoVncEventType
  inline def capabilities: capabilities = "capabilities".asInstanceOf[capabilities]
  
  @js.native
  sealed trait clipboard
    extends StObject
       with NoVncEventType
  inline def clipboard: clipboard = "clipboard".asInstanceOf[clipboard]
  
  @js.native
  sealed trait connect
    extends StObject
       with NoVncEventType
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait credentialsrequired
    extends StObject
       with NoVncEventType
  inline def credentialsrequired: credentialsrequired = "credentialsrequired".asInstanceOf[credentialsrequired]
  
  @js.native
  sealed trait desktopname
    extends StObject
       with NoVncEventType
  inline def desktopname: desktopname = "desktopname".asInstanceOf[desktopname]
  
  @js.native
  sealed trait detail
    extends StObject
       with NoVncEvent
  inline def detail: detail = "detail".asInstanceOf[detail]
  
  @js.native
  sealed trait disconnect
    extends StObject
       with NoVncEventType
  inline def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait initCustomEvent
    extends StObject
       with NoVncEvent
  inline def initCustomEvent: initCustomEvent = "initCustomEvent".asInstanceOf[initCustomEvent]
  
  @js.native
  sealed trait password extends StObject
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait securityfailure
    extends StObject
       with NoVncEventType
  inline def securityfailure: securityfailure = "securityfailure".asInstanceOf[securityfailure]
  
  @js.native
  sealed trait target extends StObject
  inline def target: target = "target".asInstanceOf[target]
  
  @js.native
  sealed trait username extends StObject
  inline def username: username = "username".asInstanceOf[username]
}
