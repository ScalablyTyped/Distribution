package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Library's Initialization Options
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
@js.native
trait IInitOptions[Ext, C /* <: IClient */] extends StObject {
  
  var capSQL: js.UndefOr[Boolean] = js.native
  
  var connect: js.UndefOr[js.Function3[/* client */ C, /* dc */ js.Any, /* useCount */ Double, Unit]] = js.native
  
  var disconnect: js.UndefOr[js.Function2[/* client */ C, /* dc */ js.Any, Unit]] = js.native
  
  var error: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ IEventContext[C], Unit]] = js.native
  
  var extend: js.UndefOr[js.Function2[/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any, Unit]] = js.native
  
  var noLocking: js.UndefOr[Boolean] = js.native
  
  var noWarnings: js.UndefOr[Boolean] = js.native
  
  var pgFormatting: js.UndefOr[Boolean] = js.native
  
  var pgNative: js.UndefOr[Boolean] = js.native
  
  var promiseLib: js.UndefOr[js.Any] = js.native
  
  var query: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
  
  var receive: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C], Unit]
  ] = js.native
  
  var schema: js.UndefOr[ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema])] = js.native
  
  var task: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
  
  var transact: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
}
object IInitOptions {
  
  @scala.inline
  def apply[Ext, C /* <: IClient */](): IInitOptions[Ext, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitOptions[Ext, C]]
  }
  
  @scala.inline
  implicit class IInitOptionsMutableBuilder[Self <: IInitOptions[_, _], Ext, C /* <: IClient */] (val x: Self with (IInitOptions[Ext, C])) extends AnyVal {
    
    @scala.inline
    def setCapSQL(value: Boolean): Self = StObject.set(x, "capSQL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapSQLUndefined: Self = StObject.set(x, "capSQL", js.undefined)
    
    @scala.inline
    def setConnect(value: (/* client */ C, /* dc */ js.Any, /* useCount */ Double) => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setDisconnect(value: (/* client */ C, /* dc */ js.Any) => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
    
    @scala.inline
    def setError(value: (/* err */ js.Any, /* e */ IEventContext[C]) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExtend(value: (/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any) => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setNoLocking(value: Boolean): Self = StObject.set(x, "noLocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLockingUndefined: Self = StObject.set(x, "noLocking", js.undefined)
    
    @scala.inline
    def setNoWarnings(value: Boolean): Self = StObject.set(x, "noWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoWarningsUndefined: Self = StObject.set(x, "noWarnings", js.undefined)
    
    @scala.inline
    def setPgFormatting(value: Boolean): Self = StObject.set(x, "pgFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPgFormattingUndefined: Self = StObject.set(x, "pgFormatting", js.undefined)
    
    @scala.inline
    def setPgNative(value: Boolean): Self = StObject.set(x, "pgNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPgNativeUndefined: Self = StObject.set(x, "pgNative", js.undefined)
    
    @scala.inline
    def setPromiseLib(value: js.Any): Self = StObject.set(x, "promiseLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseLibUndefined: Self = StObject.set(x, "promiseLib", js.undefined)
    
    @scala.inline
    def setQuery(value: /* e */ IEventContext[C] => Unit): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReceive(value: (/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C]) => Unit): Self = StObject.set(x, "receive", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReceiveUndefined: Self = StObject.set(x, "receive", js.undefined)
    
    @scala.inline
    def setSchema(value: ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema])): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaFunction1(value: /* dc */ js.Any => ValidSchema): Self = StObject.set(x, "schema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: String*): Self = StObject.set(x, "schema", js.Array(value :_*))
    
    @scala.inline
    def setTask(value: /* e */ IEventContext[C] => Unit): Self = StObject.set(x, "task", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
    
    @scala.inline
    def setTransact(value: /* e */ IEventContext[C] => Unit): Self = StObject.set(x, "transact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransactUndefined: Self = StObject.set(x, "transact", js.undefined)
  }
}
