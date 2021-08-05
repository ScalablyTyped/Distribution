package typings.onfidoSdkUi

import typings.onfidoSdkUi.anon.Id
import typings.onfidoSdkUi.anon.Options
import typings.onfidoSdkUi.anon.Variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("onfido-sdk-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(e: js.Any): OnfidoHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(e.asInstanceOf[js.Any]).asInstanceOf[OnfidoHandle]
  
  trait OnfidoConfig extends StObject {
    
    var containerId: js.UndefOr[String] = js.undefined
    
    var isModalOpen: js.UndefOr[Boolean] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* data */ OnfidoResponse, Null]] = js.undefined
    
    var onModalRequestClose: js.UndefOr[js.Function0[Null]] = js.undefined
    
    var steps: js.UndefOr[js.Array[String | Options]] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var useModal: js.UndefOr[Boolean] = js.undefined
  }
  object OnfidoConfig {
    
    inline def apply(): OnfidoConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnfidoConfig]
    }
    
    extension [Self <: OnfidoConfig](x: Self) {
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setIsModalOpen(value: Boolean): Self = StObject.set(x, "isModalOpen", value.asInstanceOf[js.Any])
      
      inline def setIsModalOpenUndefined: Self = StObject.set(x, "isModalOpen", js.undefined)
      
      inline def setOnComplete(value: /* data */ OnfidoResponse => Null): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnModalRequestClose(value: () => Null): Self = StObject.set(x, "onModalRequestClose", js.Any.fromFunction0(value))
      
      inline def setOnModalRequestCloseUndefined: Self = StObject.set(x, "onModalRequestClose", js.undefined)
      
      inline def setSteps(value: js.Array[String | Options]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: (String | Options)*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUseModal(value: Boolean): Self = StObject.set(x, "useModal", value.asInstanceOf[js.Any])
      
      inline def setUseModalUndefined: Self = StObject.set(x, "useModal", js.undefined)
    }
  }
  
  trait OnfidoHandle extends StObject {
    
    def setOptions(opts: OnfidoConfig): Null
    
    def tearDown(): Null
  }
  object OnfidoHandle {
    
    inline def apply(setOptions: OnfidoConfig => Null, tearDown: () => Null): OnfidoHandle = {
      val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions), tearDown = js.Any.fromFunction0(tearDown))
      __obj.asInstanceOf[OnfidoHandle]
    }
    
    extension [Self <: OnfidoHandle](x: Self) {
      
      inline def setSetOptions(value: OnfidoConfig => Null): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      
      inline def setTearDown(value: () => Null): Self = StObject.set(x, "tearDown", js.Any.fromFunction0(value))
    }
  }
  
  trait OnfidoResponse extends StObject {
    
    var document_front: Id
    
    var face: Variant
  }
  object OnfidoResponse {
    
    inline def apply(document_front: Id, face: Variant): OnfidoResponse = {
      val __obj = js.Dynamic.literal(document_front = document_front.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfidoResponse]
    }
    
    extension [Self <: OnfidoResponse](x: Self) {
      
      inline def setDocument_front(value: Id): Self = StObject.set(x, "document_front", value.asInstanceOf[js.Any])
      
      inline def setFace(value: Variant): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    }
  }
}
