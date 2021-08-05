package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaCoinProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personaCoinBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
  @js.native
  class PersonaCoinBase protected ()
    extends Component[IPersonaCoinProps, IPersonaState, js.Any] {
    def this(props: IPersonaCoinProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MPersonaCoinBase(nextProps: IPersonaCoinProps): Unit = js.native
    
    /**
      * Deprecation helper for getting text.
      */
    /* private */ var _getText: js.Any = js.native
    
    /* private */ var _onPhotoLoadingStateChange: js.Any = js.native
    
    /* private */ var _onRenderCoin: js.Any = js.native
    
    /* private */ var _onRenderInitials: js.Any = js.native
  }
  /* static members */
  object PersonaCoinBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase.defaultProps")
    @js.native
    def defaultProps: IPersonaCoinProps = js.native
    inline def defaultProps_=(x: IPersonaCoinProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IPersonaState extends StObject {
    
    var isImageError: js.UndefOr[Boolean] = js.undefined
    
    var isImageLoaded: js.UndefOr[Boolean] = js.undefined
  }
  object IPersonaState {
    
    inline def apply(): IPersonaState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPersonaState]
    }
    
    extension [Self <: IPersonaState](x: Self) {
      
      inline def setIsImageError(value: Boolean): Self = StObject.set(x, "isImageError", value.asInstanceOf[js.Any])
      
      inline def setIsImageErrorUndefined: Self = StObject.set(x, "isImageError", js.undefined)
      
      inline def setIsImageLoaded(value: Boolean): Self = StObject.set(x, "isImageLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsImageLoadedUndefined: Self = StObject.set(x, "isImageLoaded", js.undefined)
    }
  }
}
