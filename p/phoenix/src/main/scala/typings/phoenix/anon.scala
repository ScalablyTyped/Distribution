package typings.phoenix

import typings.phoenix.mod.BinaryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Diff extends StObject {
    
    var diff: String = js.native
    
    var state: String = js.native
  }
  object Diff {
    
    @scala.inline
    def apply(diff: String, state: String): Diff = {
      val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diff]
    }
    
    @scala.inline
    implicit class DiffMutableBuilder[Self <: Diff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiff(value: String): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Joins extends StObject {
    
    var joins: js.Object = js.native
    
    var leaves: js.Object = js.native
  }
  object Joins {
    
    @scala.inline
    def apply(joins: js.Object, leaves: js.Object): Joins = {
      val __obj = js.Dynamic.literal(joins = joins.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any])
      __obj.asInstanceOf[Joins]
    }
    
    @scala.inline
    implicit class JoinsMutableBuilder[Self <: Joins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJoins(value: js.Object): Self = StObject.set(x, "joins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaves(value: js.Object): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<phoenix.phoenix.SocketConnectOption> */
  @js.native
  trait PartialSocketConnectOptio extends StObject {
    
    var binaryType: js.UndefOr[BinaryType] = js.native
    
    var decode: js.UndefOr[
        js.Function2[/* payload */ String, /* callback */ js.Function1[/* decoded */ js.Any, Unit], Unit]
      ] = js.native
    
    var encode: js.UndefOr[
        js.Function2[
          /* payload */ js.Object, 
          /* callback */ js.Function1[/* encoded */ js.Any, Unit], 
          Unit
        ]
      ] = js.native
    
    var heartbeatIntervalMs: js.UndefOr[Double] = js.native
    
    var logger: js.UndefOr[js.Function3[/* kind */ String, /* message */ String, /* data */ js.Any, Unit]] = js.native
    
    var longpollerTimeout: js.UndefOr[Double] = js.native
    
    var params: js.UndefOr[js.Object | js.Function0[js.Object]] = js.native
    
    var reconnectAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.native
    
    var rejoinAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var transport: js.UndefOr[String] = js.native
    
    var vsn: js.UndefOr[String] = js.native
  }
  object PartialSocketConnectOptio {
    
    @scala.inline
    def apply(): PartialSocketConnectOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSocketConnectOptio]
    }
    
    @scala.inline
    implicit class PartialSocketConnectOptioMutableBuilder[Self <: PartialSocketConnectOptio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaryType(value: BinaryType): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
      
      @scala.inline
      def setDecode(value: (/* payload */ String, /* callback */ js.Function1[/* decoded */ js.Any, Unit]) => Unit): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setEncode(value: (/* payload */ js.Object, /* callback */ js.Function1[/* encoded */ js.Any, Unit]) => Unit): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setHeartbeatIntervalMs(value: Double): Self = StObject.set(x, "heartbeatIntervalMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatIntervalMsUndefined: Self = StObject.set(x, "heartbeatIntervalMs", js.undefined)
      
      @scala.inline
      def setLogger(value: (/* kind */ String, /* message */ String, /* data */ js.Any) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setLongpollerTimeout(value: Double): Self = StObject.set(x, "longpollerTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongpollerTimeoutUndefined: Self = StObject.set(x, "longpollerTimeout", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsFunction0(value: () => js.Object): Self = StObject.set(x, "params", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setReconnectAfterMs(value: /* tries */ Double => Double): Self = StObject.set(x, "reconnectAfterMs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReconnectAfterMsUndefined: Self = StObject.set(x, "reconnectAfterMs", js.undefined)
      
      @scala.inline
      def setRejoinAfterMs(value: /* tries */ Double => Double): Self = StObject.set(x, "rejoinAfterMs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRejoinAfterMsUndefined: Self = StObject.set(x, "rejoinAfterMs", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      @scala.inline
      def setVsn(value: String): Self = StObject.set(x, "vsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVsnUndefined: Self = StObject.set(x, "vsn", js.undefined)
    }
  }
}
