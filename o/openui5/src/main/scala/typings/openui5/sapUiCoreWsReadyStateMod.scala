package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreWsReadyStateMod {
  
  /**
    * Defines the different ready states for a WebSocket connection.
    */
  @JSImport("sap/ui/core/ws/ReadyState", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ReadyState & String] = js.native
    
    /* "3" */ val CLOSED: typings.openui5.sapUiCoreWsReadyStateMod.ReadyState.CLOSED & String = js.native
    
    /* "2" */ val CLOSING: typings.openui5.sapUiCoreWsReadyStateMod.ReadyState.CLOSING & String = js.native
    
    /* "0" */ val CONNECTING: typings.openui5.sapUiCoreWsReadyStateMod.ReadyState.CONNECTING & String = js.native
    
    /* "1" */ val OPEN: typings.openui5.sapUiCoreWsReadyStateMod.ReadyState.OPEN & String = js.native
  }
  
  @js.native
  sealed trait ReadyState extends StObject
  /**
    * Defines the different ready states for a WebSocket connection.
    */
  @JSImport("sap/ui/core/ws/ReadyState", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    /**
      * The connection has been closed or could not be opened.
      */
    @js.native
    sealed trait CLOSED
      extends StObject
         with ReadyState
    
    /**
      * The connection is going through the closing handshake.
      */
    @js.native
    sealed trait CLOSING
      extends StObject
         with ReadyState
    
    /**
      * The connection has not yet been established.
      */
    @js.native
    sealed trait CONNECTING
      extends StObject
         with ReadyState
    
    /**
      * The WebSocket connection is established and communication is possible.
      */
    @js.native
    sealed trait OPEN
      extends StObject
         with ReadyState
  }
}
