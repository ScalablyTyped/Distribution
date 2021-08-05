package typings.officeUiFabricReact

import typings.officeUiFabricReact.ratingTypesMod.IRatingProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Rating/Rating.base", "RatingBase")
  @js.native
  class RatingBase protected ()
    extends Component[IRatingProps, IRatingState, js.Any] {
    def this(props: IRatingProps) = this()
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _getClampedRating: js.Any = js.native
    
    /* private */ var _getFillingPercentage: js.Any = js.native
    
    /* private */ var _getInitialValue: js.Any = js.native
    
    /* private */ var _getLabel: js.Any = js.native
    
    /* private */ var _getRating: js.Any = js.native
    
    /* private */ var _getStarId: js.Any = js.native
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _labelId: js.Any = js.native
    
    /* private */ var _min: js.Any = js.native
    
    /* private */ var _onFocus: js.Any = js.native
  }
  /* static members */
  object RatingBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Rating/Rating.base", "RatingBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Rating/Rating.base", "RatingBase.defaultProps")
    @js.native
    def defaultProps: IRatingProps = js.native
    inline def defaultProps_=(x: IRatingProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IRatingState extends StObject {
    
    var rating: js.UndefOr[Double | Null] = js.undefined
  }
  object IRatingState {
    
    inline def apply(): IRatingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRatingState]
    }
    
    extension [Self <: IRatingState](x: Self) {
      
      inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingNull: Self = StObject.set(x, "rating", null)
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    }
  }
}
