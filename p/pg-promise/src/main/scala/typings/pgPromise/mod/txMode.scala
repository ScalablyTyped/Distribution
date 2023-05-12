package typings.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import typings.pgPromise.anon.Deferrable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object txMode {
  
  @JSImport("pg-promise", "txMode")
  @js.native
  val ^ : js.Any = js.native
  
  // TransactionMode class;
  // API: http://vitaly-t.github.io/pg-promise/txMode.TransactionMode.html
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pg-promise", "txMode.TransactionMode")
  @js.native
  open class TransactionMode ()
    extends StObject
       with typings.pgPromise.mod._txMode.TransactionMode {
    def this(options: Deferrable) = this()
  }
  // TransactionMode class;
  // API: http://vitaly-t.github.io/pg-promise/txMode.TransactionMode.html
  @JSImport("pg-promise", "txMode.TransactionMode")
  @js.native
  def TransactionMode: Instantiable1[
    /* options */ js.UndefOr[Deferrable], 
    typings.pgPromise.mod._txMode.TransactionMode
  ] = js.native
  inline def TransactionMode_=(
    x: Instantiable1[
      /* options */ js.UndefOr[Deferrable], 
      typings.pgPromise.mod._txMode.TransactionMode
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TransactionMode")(x.asInstanceOf[js.Any])
}
