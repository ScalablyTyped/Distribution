package typings.microgears

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("microgears", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPlugin[T /* <: Plugin */](plugin: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addService[T /* <: Service */](service: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("addService")(service.asInstanceOf[js.Any]).asInstanceOf[T]
  
  trait MetaInformation extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var extra: Any
    
    var methodName: String
    
    var serviceName: String
    
    var serviceNameSpace: String
  }
  object MetaInformation {
    
    inline def apply(extra: Any, methodName: String, serviceName: String, serviceNameSpace: String): MetaInformation = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceNameSpace = serviceNameSpace.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetaInformation] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setServiceNameSpace(value: String): Self = StObject.set(x, "serviceNameSpace", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plugin extends StObject {
    
    def afterChain[T, M /* <: MetaInformation */](result: T, metaInfo: M): T
    
    def beforeChain[M /* <: MetaInformation */](args: js.Array[Any], metaInfo: M): js.Array[Any]
    
    var name: String
  }
  object Plugin {
    
    inline def apply(afterChain: (Any, Any) => Any, beforeChain: (js.Array[Any], Any) => js.Array[Any], name: String): Plugin = {
      val __obj = js.Dynamic.literal(afterChain = js.Any.fromFunction2(afterChain), beforeChain = js.Any.fromFunction2(beforeChain), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      inline def setAfterChain(value: (Any, Any) => Any): Self = StObject.set(x, "afterChain", js.Any.fromFunction2(value))
      
      inline def setBeforeChain(value: (js.Array[Any], Any) => js.Array[Any]): Self = StObject.set(x, "beforeChain", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Service extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var namespace: String
    
    var pathname: js.UndefOr[String] = js.undefined
  }
  object Service {
    
    inline def apply(name: String, namespace: String): Service = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    }
  }
}
