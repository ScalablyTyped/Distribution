package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsRatingRatingDottypesMod.IRatingProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsRatingRatingDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Rating/Rating.base", "RatingBase")
  @js.native
  open class RatingBase protected () extends Component[IRatingProps, IRatingState, Any] {
    def this(props: IRatingProps) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _getClampedRating: Any = js.native
    
    /* private */ var _getFillingPercentage: Any = js.native
    
    /* private */ var _getInitialValue: Any = js.native
    
    /* private */ var _getLabel: Any = js.native
    
    /* private */ var _getRating: Any = js.native
    
    /* private */ var _getStarId: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _labelId: Any = js.native
    
    /* private */ var _min: Any = js.native
    
    /* private */ var _onFocus: Any = js.native
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
