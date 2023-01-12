package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJavaJavaServerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/java/JavaServer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JavaServer {
    
    /* CompleteClass */
    var configFileName: String = js.native
    
    /* CompleteClass */
    override def listServices(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def publishService(serviceUrl: String, serviceJavaClass: Any): Unit = js.native
    
    /* CompleteClass */
    override def unpublishService(serviceUrl: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/java/JavaServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Classes]
  
  type Classes = typings.nginstackEngine.libDatabaseClassesMod.^
  
  trait JavaServer extends StObject {
    
    var configFileName: String
    
    def listServices(): js.Array[Any]
    
    def publishService(serviceUrl: String, serviceJavaClass: Any): Unit
    
    def unpublishService(serviceUrl: String): Unit
  }
  object JavaServer {
    
    inline def apply(
      configFileName: String,
      listServices: () => js.Array[Any],
      publishService: (String, Any) => Unit,
      unpublishService: String => Unit
    ): JavaServer = {
      val __obj = js.Dynamic.literal(configFileName = configFileName.asInstanceOf[js.Any], listServices = js.Any.fromFunction0(listServices), publishService = js.Any.fromFunction2(publishService), unpublishService = js.Any.fromFunction1(unpublishService))
      __obj.asInstanceOf[JavaServer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JavaServer] (val x: Self) extends AnyVal {
      
      inline def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
      
      inline def setListServices(value: () => js.Array[Any]): Self = StObject.set(x, "listServices", js.Any.fromFunction0(value))
      
      inline def setPublishService(value: (String, Any) => Unit): Self = StObject.set(x, "publishService", js.Any.fromFunction2(value))
      
      inline def setUnpublishService(value: String => Unit): Self = StObject.set(x, "unpublishService", js.Any.fromFunction1(value))
    }
  }
}
