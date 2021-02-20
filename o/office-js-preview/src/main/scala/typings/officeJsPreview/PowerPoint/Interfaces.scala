package typings.officeJsPreview.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Interfaces {
  
  /**
    * Provides ways to load properties of only a subset of members of a collection.
    */
  @js.native
  trait CollectionLoadOptions extends StObject {
    
    /**
      * Specify the number of items in the collection that are to be skipped and not included in the result. If top is specified, the selection of result will start after skipping the specified number of items.
      */
    @JSName("$skip")
    var $skip: js.UndefOr[Double] = js.native
    
    /**
      * Specify the number of items in the queried collection to be included in the result.
      */
    @JSName("$top")
    var $top: js.UndefOr[Double] = js.native
  }
  object CollectionLoadOptions {
    
    @scala.inline
    def apply(): CollectionLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionLoadOptions]
    }
    
    @scala.inline
    implicit class CollectionLoadOptionsMutableBuilder[Self <: CollectionLoadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$skip(value: Double): Self = StObject.set(x, "$skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$skipUndefined: Self = StObject.set(x, "$skip", js.undefined)
      
      @scala.inline
      def set$top(value: Double): Self = StObject.set(x, "$top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$topUndefined: Self = StObject.set(x, "$top", js.undefined)
    }
  }
  
  /** An interface describing the data returned by calling `presentation.toJSON()`. */
  @js.native
  trait PresentationData extends StObject {
    
    var title: js.UndefOr[String] = js.native
  }
  object PresentationData {
    
    @scala.inline
    def apply(): PresentationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresentationData]
    }
    
    @scala.inline
    implicit class PresentationDataMutableBuilder[Self <: PresentationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * [Api set: PowerPointApi 1.0]
    */
  @js.native
  trait PresentationLoadOptions extends StObject {
    
    /**
      Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
      */
    @JSName("$all")
    var $all: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[Boolean] = js.native
  }
  object PresentationLoadOptions {
    
    @scala.inline
    def apply(): PresentationLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresentationLoadOptions]
    }
    
    @scala.inline
    implicit class PresentationLoadOptionsMutableBuilder[Self <: PresentationLoadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
      
      @scala.inline
      def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /** An interface describing the data returned by calling `slideCollection.toJSON()`. */
  @js.native
  trait SlideCollectionData extends StObject {
    
    var items: js.UndefOr[js.Array[SlideData]] = js.native
  }
  object SlideCollectionData {
    
    @scala.inline
    def apply(): SlideCollectionData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideCollectionData]
    }
    
    @scala.inline
    implicit class SlideCollectionDataMutableBuilder[Self <: SlideCollectionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[SlideData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SlideData*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  /**
    *
    * Represents the collection of slides in the presentation.
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  trait SlideCollectionLoadOptions extends StObject {
    
    /**
      Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
      */
    @JSName("$all")
    var $all: js.UndefOr[Boolean] = js.native
    
    /**
      *
      * For EACH ITEM in the collection: Gets the unique ID of the slide.
      *
      * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
      * @beta
      */
    var id: js.UndefOr[Boolean] = js.native
  }
  object SlideCollectionLoadOptions {
    
    @scala.inline
    def apply(): SlideCollectionLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideCollectionLoadOptions]
    }
    
    @scala.inline
    implicit class SlideCollectionLoadOptionsMutableBuilder[Self <: SlideCollectionLoadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
      
      @scala.inline
      def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /** An interface for updating data on the SlideCollection object, for use in `slideCollection.set({ ... })`. */
  @js.native
  trait SlideCollectionUpdateData extends StObject {
    
    var items: js.UndefOr[js.Array[SlideData]] = js.native
  }
  object SlideCollectionUpdateData {
    
    @scala.inline
    def apply(): SlideCollectionUpdateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideCollectionUpdateData]
    }
    
    @scala.inline
    implicit class SlideCollectionUpdateDataMutableBuilder[Self <: SlideCollectionUpdateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[SlideData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SlideData*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  /** An interface describing the data returned by calling `slide.toJSON()`. */
  @js.native
  trait SlideData extends StObject {
    
    /**
      *
      * Gets the unique ID of the slide.
      *
      * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
      * @beta
      */
    var id: js.UndefOr[String] = js.native
  }
  object SlideData {
    
    @scala.inline
    def apply(): SlideData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideData]
    }
    
    @scala.inline
    implicit class SlideDataMutableBuilder[Self <: SlideData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /**
    *
    * Represents a single slide of a presentation.
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  trait SlideLoadOptions extends StObject {
    
    /**
      Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
      */
    @JSName("$all")
    var $all: js.UndefOr[Boolean] = js.native
    
    /**
      *
      * Gets the unique ID of the slide.
      *
      * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
      * @beta
      */
    var id: js.UndefOr[Boolean] = js.native
  }
  object SlideLoadOptions {
    
    @scala.inline
    def apply(): SlideLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideLoadOptions]
    }
    
    @scala.inline
    implicit class SlideLoadOptionsMutableBuilder[Self <: SlideLoadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
      
      @scala.inline
      def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
