package typings.oracleOraclejet

import typings.oracleOraclejet.anon.Description
import typings.oracleOraclejet.anon.DescriptionId
import typings.std.Element
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcontextMod {
  
  @JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
  @js.native
  class ^ () extends Context
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojcontext", "getContext")
  @js.native
  def getContext(node: Element): Context = js.native
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojcontext", "getPageContext")
  @js.native
  def getPageContext(): Context = js.native
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojcontext", "setBusyContextDefaultTimeout")
  @js.native
  def setBusyContextDefaultTimeout(timeout: Double): js.Any = js.native
  
  @js.native
  trait BusyContext extends StObject {
    
    def addBusyState(options: Description): js.Function0[Unit] = js.native
    
    def applicationBootstrapComplete(): js.UndefOr[scala.Nothing] = js.native
    
    def clear(): js.UndefOr[scala.Nothing] = js.native
    
    def dump(): js.UndefOr[scala.Nothing] = js.native
    def dump(message: String): js.UndefOr[scala.Nothing] = js.native
    
    def getBusyStates(): js.Array[DescriptionId] = js.native
    
    def isReady(): Boolean = js.native
    
    def whenReady(): js.Promise[Boolean | Error] = js.native
    def whenReady(timeout: Double): js.Promise[Boolean | Error] = js.native
  }
  
  @js.native
  trait Context extends StObject {
    
    def getBusyContext(): BusyContext = js.native
  }
  object Context {
    
    @scala.inline
    def apply(getBusyContext: () => BusyContext): Context = {
      val __obj = js.Dynamic.literal(getBusyContext = js.Any.fromFunction0(getBusyContext))
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetBusyContext(value: () => BusyContext): Self = StObject.set(x, "getBusyContext", js.Any.fromFunction0(value))
    }
  }
}
