package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cards {
  
  @js.native
  sealed trait HeaderPosition extends StObject
  /**
    * @since 1.65
    *
    * Different options for the position of the header in controls that implement the {@link sap.f.ICard} interface.
    */
  @JSImport("sap/f/library", "cards.HeaderPosition")
  @js.native
  object HeaderPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HeaderPosition & String] = js.native
    
    /**
      * The Header is under the content.
      */
    @js.native
    sealed trait Bottom
      extends StObject
         with HeaderPosition
    /* "Bottom" */ val Bottom: typings.openui5.sapFLibraryMod.cards.HeaderPosition.Bottom & String = js.native
    
    /**
      * The Header is over the content.
      */
    @js.native
    sealed trait Top
      extends StObject
         with HeaderPosition
    /* "Top" */ val Top: typings.openui5.sapFLibraryMod.cards.HeaderPosition.Top & String = js.native
  }
  
  @js.native
  sealed trait NumericHeaderSideIndicatorsAlignment extends StObject
  /**
    * @since 1.96
    *
    * Different options for the alignment of the side indicators in the numeric header.
    */
  @JSImport("sap/f/library", "cards.NumericHeaderSideIndicatorsAlignment")
  @js.native
  object NumericHeaderSideIndicatorsAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NumericHeaderSideIndicatorsAlignment & String] = js.native
    
    /**
      * Sets the alignment to the beginning (left or right depending on LTR/RTL).
      */
    @js.native
    sealed trait Begin
      extends StObject
         with NumericHeaderSideIndicatorsAlignment
    /* "Begin" */ val Begin: typings.openui5.sapFLibraryMod.cards.NumericHeaderSideIndicatorsAlignment.Begin & String = js.native
    
    /**
      * Explicitly sets the alignment to the end (left or right depending on LTR/RTL).
      */
    @js.native
    sealed trait End
      extends StObject
         with NumericHeaderSideIndicatorsAlignment
    /* "End" */ val End: typings.openui5.sapFLibraryMod.cards.NumericHeaderSideIndicatorsAlignment.End & String = js.native
  }
  
  /**
    * @since 1.62
    *
    * Marker interface for controls suitable as a header in controls that implement the {@link sap.f.ICard }
    * interface.
    */
  trait IHeader extends StObject {
    
    var __implements__sap_f_cards_IHeader: Boolean
  }
  object IHeader {
    
    inline def apply(__implements__sap_f_cards_IHeader: Boolean): IHeader = {
      val __obj = js.Dynamic.literal(__implements__sap_f_cards_IHeader = __implements__sap_f_cards_IHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHeader] (val x: Self) extends AnyVal {
      
      inline def set__implements__sap_f_cards_IHeader(value: Boolean): Self = StObject.set(x, "__implements__sap_f_cards_IHeader", value.asInstanceOf[js.Any])
    }
  }
}
