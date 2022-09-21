package typings.pgCursor

import typings.pg.mod.Connection
import typings.pg.mod.CustomTypesConfig
import typings.pg.mod.QueryResult
import typings.pgCursor.pgCursorStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-cursor", JSImport.Namespace)
  @js.native
  open class ^[Row] protected () extends Cursor[Row] {
    def this(query: String) = this()
    def this(query: String, values: js.Array[Any]) = this()
    def this(query: String, values: js.Array[Any], config: CursorQueryConfig) = this()
    def this(query: String, values: Unit, config: CursorQueryConfig) = this()
  }
  
  @js.native
  trait Cursor[Row]
    extends typings.node.eventsMod.^ {
    
    def close(): js.UndefOr[js.Promise[Unit]] = js.native
    def close(callback: js.Function1[/* err */ js.Error, Unit]): js.UndefOr[js.Promise[Unit]] = js.native
    @JSName("close")
    def close_Promise(): js.Promise[Unit] = js.native
    @JSName("close")
    def close_Unit(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /**
      * @deprecated Cursor.end is deprecated. Call end on the client itself to end a connection to the database.
      */
    def end(callback: js.Function0[Unit]): Unit = js.native
    
    def read(maxRows: Double): js.UndefOr[js.Promise[js.Array[Row]]] = js.native
    def read(maxRows: Double, callback: ResultCallback[Row]): js.UndefOr[js.Promise[js.Array[Row]]] = js.native
    @JSName("read")
    def read_Promise(maxRows: Double): js.Promise[js.Array[Row]] = js.native
    @JSName("read")
    def read_Unit(maxRows: Double, callback: ResultCallback[Row]): Unit = js.native
    
    def submit(connection: Connection): Unit = js.native
  }
  
  trait CursorQueryConfig extends StObject {
    
    /**
      * By default rows come out as a Record<string,any>.
      * Pass the string 'array' here to receive each row as an array of values.
      */
    var rowMode: js.UndefOr[array] = js.undefined
    
    /**
      * Custom type parsers for just this query result.
      */
    var types: js.UndefOr[CustomTypesConfig] = js.undefined
  }
  object CursorQueryConfig {
    
    inline def apply(): CursorQueryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CursorQueryConfig]
    }
    
    extension [Self <: CursorQueryConfig](x: Self) {
      
      inline def setRowMode(value: array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
      
      inline def setRowModeUndefined: Self = StObject.set(x, "rowMode", js.undefined)
      
      inline def setTypes(value: CustomTypesConfig): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
  
  type ResultCallback[RowType] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* rows */ js.Array[RowType], 
    /* result */ QueryResult[Any], 
    Unit
  ]
}
