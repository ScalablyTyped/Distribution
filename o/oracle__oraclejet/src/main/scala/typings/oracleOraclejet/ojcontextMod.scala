package typings.oracleOraclejet

import typings.oracleOraclejet.anon.Description
import typings.oracleOraclejet.anon.DescriptionId
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcontextMod {
  
  @JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Context {
    
    /* CompleteClass */
    override def getBusyContext(): BusyContext = js.native
  }
  @JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getContext(node: Element): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(node.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  /* static member */
  inline def getPageContext(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageContext")().asInstanceOf[Context]
  
  /* static member */
  inline def setBusyContextDefaultTimeout(timeout: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setBusyContextDefaultTimeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @js.native
  trait BusyContext extends StObject {
    
    def addBusyState(options: Description): js.Function0[Unit] = js.native
    
    def applicationBootstrapComplete(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def dump(): Unit = js.native
    def dump(message: String): Unit = js.native
    
    def getBusyStates(): js.Array[DescriptionId] = js.native
    
    def isReady(): Boolean = js.native
    
    def whenReady(): js.Promise[Boolean | js.Error] = js.native
    def whenReady(timeout: Double): js.Promise[Boolean | js.Error] = js.native
  }
  
  trait Context extends StObject {
    
    def getBusyContext(): BusyContext
  }
  object Context {
    
    inline def apply(getBusyContext: () => BusyContext): Context = {
      val __obj = js.Dynamic.literal(getBusyContext = js.Any.fromFunction0(getBusyContext))
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setGetBusyContext(value: () => BusyContext): Self = StObject.set(x, "getBusyContext", js.Any.fromFunction0(value))
    }
  }
}
