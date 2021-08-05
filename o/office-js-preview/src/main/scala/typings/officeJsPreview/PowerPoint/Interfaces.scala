package typings.officeJsPreview.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Interfaces {
  
  /**
    * Provides ways to load properties of only a subset of members of a collection.
    */
  trait CollectionLoadOptions extends StObject {
    
    /**
      * Specify the number of items in the collection that are to be skipped and not included in the result. If top is specified, the selection of result will start after skipping the specified number of items.
      */
    @JSName("$skip")
    var $skip: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the number of items in the queried collection to be included in the result.
      */
    @JSName("$top")
    var $top: js.UndefOr[Double] = js.undefined
  }
  object CollectionLoadOptions {
    
    inline def apply(): CollectionLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionLoadOptions]
    }
    
    extension [Self <: CollectionLoadOptions](x: Self) {
      
      inline def set$skip(value: Double): Self = StObject.set(x, "$skip", value.asInstanceOf[js.Any])
      
      inline def set$skipUndefined: Self = StObject.set(x, "$skip", js.undefined)
      
      inline def set$top(value: Double): Self = StObject.set(x, "$top", value.asInstanceOf[js.Any])
      
      inline def set$topUndefined: Self = StObject.set(x, "$top", js.undefined)
    }
  }
  
  /** An interface describing the data returned by calling `presentation.toJSON()`. */
  trait PresentationData extends StObject {
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PresentationData {
    
    inline def apply(): PresentationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresentationData]
    }
    
    extension [Self <: PresentationData](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * [Api set: PowerPointApi 1.0]
    */
  trait PresentationLoadOptions extends StObject {
    
    /**
      Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
      */
    @JSName("$all")
    var $all: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[Boolean] = js.undefined
  }
  object PresentationLoadOptions {
    
    inline def apply(): PresentationLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresentationLoadOptions]
    }
    
    extension [Self <: PresentationLoadOptions](x: Self) {
      
      inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
      
      inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /** An interface describing the data returned by calling `slideCollection.toJSON()`. */
  trait SlideCollectionData extends StObject {
    
    var items: js.UndefOr[js.Array[SlideData]] = js.undefined
  }
  object SlideCollectionData {
    
    inline def apply(): SlideCollectionData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideCollectionData]
    }
    
    extension [Self <: SlideCollectionData](x: Self) {
      
      inline def setItems(value: js.Array[SlideData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SlideData*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  /**
    *
    * Represents the collection of slides in the presentation.
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  trait SlideCollectionLoadOptions extends StObject {
    
    /**
      Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
      */
    @JSName("$all")
    var $all: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * For EACH ITEM in the collection: Gets the unique ID of the slide.
      *
      * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
      * @beta
      */
    var id: js.UndefOr[Boolean] = js.undefined
  }
  object SlideCollectionLoadOptions {
    
    inline def apply(): SlideCollectionLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideCollectionLoadOptions]
    }
    
    extension [Self <: SlideCollectionLoadOptions](x: Self) {
      
      inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
      
      inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /** An interface for updating data on the SlideCollection object, for use in `slideCollection.set({ ... })`. */
  trait SlideCollectionUpdateData extends StObject {
    
    var items: js.UndefOr[js.Array[SlideData]] = js.undefined
  }
  object SlideCollectionUpdateData {
    
    inline def apply(): SlideCollectionUpdateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideCollectionUpdateData]
    }
    
    extension [Self <: SlideCollectionUpdateData](x: Self) {
      
      inline def setItems(value: js.Array[SlideData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SlideData*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  /** An interface describing the data returned by calling `slide.toJSON()`. */
  trait SlideData extends StObject {
    
    /**
      *
      * Gets the unique ID of the slide.
      *
      * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
      * @beta
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object SlideData {
    
    inline def apply(): SlideData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideData]
    }
    
    extension [Self <: SlideData](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /**
    *
    * Represents a single slide of a presentation.
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  trait SlideLoadOptions extends StObject {
    
    /**
      Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
      */
    @JSName("$all")
    var $all: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Gets the unique ID of the slide.
      *
      * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
      * @beta
      */
    var id: js.UndefOr[Boolean] = js.undefined
  }
  object SlideLoadOptions {
    
    inline def apply(): SlideLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideLoadOptions]
    }
    
    extension [Self <: SlideLoadOptions](x: Self) {
      
      inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
      
      inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
