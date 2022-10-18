package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectMarkerType extends StObject
@JSImport("sap/m/library", "ObjectMarkerType")
@js.native
object ObjectMarkerType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ObjectMarkerType & String] = js.native
  
  /**
    * Draft type
    */
  @js.native
  sealed trait Draft
    extends StObject
       with ObjectMarkerType
  /* "Draft" */ val Draft: typings.openui5.sapMLibraryMod.ObjectMarkerType.Draft & String = js.native
  
  /**
    * Favorite type
    */
  @js.native
  sealed trait Favorite
    extends StObject
       with ObjectMarkerType
  /* "Favorite" */ val Favorite: typings.openui5.sapMLibraryMod.ObjectMarkerType.Favorite & String = js.native
  
  /**
    * Flagged type
    */
  @js.native
  sealed trait Flagged
    extends StObject
       with ObjectMarkerType
  /* "Flagged" */ val Flagged: typings.openui5.sapMLibraryMod.ObjectMarkerType.Flagged & String = js.native
  
  /**
    * Locked type
    */
  @js.native
  sealed trait Locked
    extends StObject
       with ObjectMarkerType
  /* "Locked" */ val Locked: typings.openui5.sapMLibraryMod.ObjectMarkerType.Locked & String = js.native
  
  /**
    * LockedBy type Use when you need to display the name of the user who locked the object.
    */
  @js.native
  sealed trait LockedBy
    extends StObject
       with ObjectMarkerType
  /* "LockedBy" */ val LockedBy: typings.openui5.sapMLibraryMod.ObjectMarkerType.LockedBy & String = js.native
  
  /**
    * Unsaved type
    */
  @js.native
  sealed trait Unsaved
    extends StObject
       with ObjectMarkerType
  /* "Unsaved" */ val Unsaved: typings.openui5.sapMLibraryMod.ObjectMarkerType.Unsaved & String = js.native
  
  /**
    * UnsavedBy type Use when you need to display the name of the user whose changes were unsaved.
    */
  @js.native
  sealed trait UnsavedBy
    extends StObject
       with ObjectMarkerType
  /* "UnsavedBy" */ val UnsavedBy: typings.openui5.sapMLibraryMod.ObjectMarkerType.UnsavedBy & String = js.native
}
