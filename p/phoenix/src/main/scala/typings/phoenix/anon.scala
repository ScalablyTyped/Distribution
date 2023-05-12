package typings.phoenix

import org.scalablytyped.runtime.Instantiable1
import typings.phoenix.mod.BinaryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Diff extends StObject {
    
    var diff: String
    
    var state: String
  }
  object Diff {
    
    inline def apply(diff: String, state: String): Diff = {
      val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diff]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Diff] (val x: Self) extends AnyVal {
      
      inline def setDiff(value: String): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Joins extends StObject {
    
    var joins: js.Object
    
    var leaves: js.Object
  }
  object Joins {
    
    inline def apply(joins: js.Object, leaves: js.Object): Joins = {
      val __obj = js.Dynamic.literal(joins = joins.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any])
      __obj.asInstanceOf[Joins]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Joins] (val x: Self) extends AnyVal {
      
      inline def setJoins(value: js.Object): Self = StObject.set(x, "joins", value.asInstanceOf[js.Any])
      
      inline def setLeaves(value: js.Object): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<phoenix.phoenix.SocketConnectOption> */
  trait PartialSocketConnectOptio extends StObject {
    
    var binaryType: js.UndefOr[BinaryType] = js.undefined
    
    var decode: js.UndefOr[
        js.Function2[
          /* payload */ String, 
          /* callback */ js.Function1[/* decoded */ Any, Unit | js.Promise[Unit]], 
          Unit
        ]
      ] = js.undefined
    
    var encode: js.UndefOr[
        js.Function2[
          /* payload */ js.Object, 
          /* callback */ js.Function1[/* encoded */ Any, Unit | js.Promise[Unit]], 
          Unit
        ]
      ] = js.undefined
    
    var heartbeatIntervalMs: js.UndefOr[Double] = js.undefined
    
    var logger: js.UndefOr[js.Function3[/* kind */ String, /* message */ String, /* data */ Any, Unit]] = js.undefined
    
    var longpollerTimeout: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[js.Object | js.Function0[js.Object]] = js.undefined
    
    var reconnectAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.undefined
    
    var rejoinAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var transport: js.UndefOr[Instantiable1[/* endpoint */ String, js.Object]] = js.undefined
    
    var vsn: js.UndefOr[String] = js.undefined
  }
  object PartialSocketConnectOptio {
    
    inline def apply(): PartialSocketConnectOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSocketConnectOptio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSocketConnectOptio] (val x: Self) extends AnyVal {
      
      inline def setBinaryType(value: BinaryType): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
      
      inline def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
      
      inline def setDecode(
        value: (/* payload */ String, /* callback */ js.Function1[/* decoded */ Any, Unit | js.Promise[Unit]]) => Unit
      ): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setEncode(
        value: (/* payload */ js.Object, /* callback */ js.Function1[/* encoded */ Any, Unit | js.Promise[Unit]]) => Unit
      ): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setHeartbeatIntervalMs(value: Double): Self = StObject.set(x, "heartbeatIntervalMs", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatIntervalMsUndefined: Self = StObject.set(x, "heartbeatIntervalMs", js.undefined)
      
      inline def setLogger(value: (/* kind */ String, /* message */ String, /* data */ Any) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction3(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setLongpollerTimeout(value: Double): Self = StObject.set(x, "longpollerTimeout", value.asInstanceOf[js.Any])
      
      inline def setLongpollerTimeoutUndefined: Self = StObject.set(x, "longpollerTimeout", js.undefined)
      
      inline def setParams(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsFunction0(value: () => js.Object): Self = StObject.set(x, "params", js.Any.fromFunction0(value))
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setReconnectAfterMs(value: /* tries */ Double => Double): Self = StObject.set(x, "reconnectAfterMs", js.Any.fromFunction1(value))
      
      inline def setReconnectAfterMsUndefined: Self = StObject.set(x, "reconnectAfterMs", js.undefined)
      
      inline def setRejoinAfterMs(value: /* tries */ Double => Double): Self = StObject.set(x, "rejoinAfterMs", js.Any.fromFunction1(value))
      
      inline def setRejoinAfterMsUndefined: Self = StObject.set(x, "rejoinAfterMs", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransport(value: Instantiable1[/* endpoint */ String, js.Object]): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setVsn(value: String): Self = StObject.set(x, "vsn", value.asInstanceOf[js.Any])
      
      inline def setVsnUndefined: Self = StObject.set(x, "vsn", js.undefined)
    }
  }
}
