package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityItemTypesMod {
  
  trait IActivityItemProps
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    /**
      * An element describing the activity that took place. If no activityDescription, activityDescriptionText, or
      * onRenderActivityDescription are included, no description of the activity is shown.
      */
    var activityDescription: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    /**
      * Text describing the activity that occurred and naming the people involved in it.
      * Deprecated, use `activityDescription` instead.
      * @deprecated Use `activityDescription` instead.
      */
    var activityDescriptionText: js.UndefOr[String] = js.undefined
    
    /**
      * An element containing an icon shown next to the activity item.
      */
    var activityIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If activityIcon is not set, then the persona props in this array will be used as the icon for this activity item.
      */
    var activityPersonas: js.UndefOr[js.Array[IPersonaSharedProps]] = js.undefined
    
    /**
      * Enables/Disables the beacon that radiates
      * from the center of the center of the activity icon. Signals an activity has started.
      * @defaultvalue false
      */
    var animateBeaconSignal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Beacon color one
      */
    var beaconColorOne: js.UndefOr[String] = js.undefined
    
    /**
      * Beacon color two
      */
    var beaconColorTwo: js.UndefOr[String] = js.undefined
    
    /**
      * Text of comments or \@mention messages.
      * Deprecated, use `comments` instead.
      * @deprecated Use `comments` instead.
      */
    var commentText: js.UndefOr[String] = js.undefined
    
    /**
      * An element containing the text of comments or \@mention messages.
      * If no comments, commentText, or onRenderComments are included, no comments are shown.
      */
    var comments: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    /**
      * Indicated if the compact styling should be used.
      */
    var isCompact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A renderer for the description of the current activity.
      */
    var onRenderActivityDescription: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
    
    /**
      * A renderer that adds the text of a comment below the activity description.
      */
    var onRenderComments: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
    
    /**
      * A renderer to create the icon next to the activity item.
      */
    var onRenderIcon: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
    
    /**
      * A renderer adds a time stamp. If not included, timeStamp is shown as plain text below the activity.
      */
    var onRenderTimeStamp: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
    
    /**
      * Optional styling for the elements within the Activity Item.
      */
    var styles: js.UndefOr[IActivityItemStyles] = js.undefined
    
    /**
      * Element shown as a timestamp on this activity. If not included, no timestamp is shown.
      */
    var timeStamp: js.UndefOr[String | js.Array[ReactNode] | ReactNode] = js.undefined
  }
  object IActivityItemProps {
    
    inline def apply(): IActivityItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActivityItemProps]
    }
    
    extension [Self <: IActivityItemProps](x: Self) {
      
      inline def setActivityDescription(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "activityDescription", value.asInstanceOf[js.Any])
      
      inline def setActivityDescriptionText(value: String): Self = StObject.set(x, "activityDescriptionText", value.asInstanceOf[js.Any])
      
      inline def setActivityDescriptionTextUndefined: Self = StObject.set(x, "activityDescriptionText", js.undefined)
      
      inline def setActivityDescriptionUndefined: Self = StObject.set(x, "activityDescription", js.undefined)
      
      inline def setActivityDescriptionVarargs(value: ReactNode*): Self = StObject.set(x, "activityDescription", js.Array(value :_*))
      
      inline def setActivityIcon(value: ReactNode): Self = StObject.set(x, "activityIcon", value.asInstanceOf[js.Any])
      
      inline def setActivityIconUndefined: Self = StObject.set(x, "activityIcon", js.undefined)
      
      inline def setActivityPersonas(value: js.Array[IPersonaSharedProps]): Self = StObject.set(x, "activityPersonas", value.asInstanceOf[js.Any])
      
      inline def setActivityPersonasUndefined: Self = StObject.set(x, "activityPersonas", js.undefined)
      
      inline def setActivityPersonasVarargs(value: IPersonaSharedProps*): Self = StObject.set(x, "activityPersonas", js.Array(value :_*))
      
      inline def setAnimateBeaconSignal(value: Boolean): Self = StObject.set(x, "animateBeaconSignal", value.asInstanceOf[js.Any])
      
      inline def setAnimateBeaconSignalUndefined: Self = StObject.set(x, "animateBeaconSignal", js.undefined)
      
      inline def setBeaconColorOne(value: String): Self = StObject.set(x, "beaconColorOne", value.asInstanceOf[js.Any])
      
      inline def setBeaconColorOneUndefined: Self = StObject.set(x, "beaconColorOne", js.undefined)
      
      inline def setBeaconColorTwo(value: String): Self = StObject.set(x, "beaconColorTwo", value.asInstanceOf[js.Any])
      
      inline def setBeaconColorTwoUndefined: Self = StObject.set(x, "beaconColorTwo", js.undefined)
      
      inline def setCommentText(value: String): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
      
      inline def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
      
      inline def setComments(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCommentsVarargs(value: ReactNode*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      inline def setIsCompact(value: Boolean): Self = StObject.set(x, "isCompact", value.asInstanceOf[js.Any])
      
      inline def setIsCompactUndefined: Self = StObject.set(x, "isCompact", js.undefined)
      
      inline def setOnRenderActivityDescription(
        value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderActivityDescription", js.Any.fromFunction2(value))
      
      inline def setOnRenderActivityDescriptionUndefined: Self = StObject.set(x, "onRenderActivityDescription", js.undefined)
      
      inline def setOnRenderComments(
        value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderComments", js.Any.fromFunction2(value))
      
      inline def setOnRenderCommentsUndefined: Self = StObject.set(x, "onRenderComments", js.undefined)
      
      inline def setOnRenderIcon(
        value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderIcon", js.Any.fromFunction2(value))
      
      inline def setOnRenderIconUndefined: Self = StObject.set(x, "onRenderIcon", js.undefined)
      
      inline def setOnRenderTimeStamp(
        value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderTimeStamp", js.Any.fromFunction2(value))
      
      inline def setOnRenderTimeStampUndefined: Self = StObject.set(x, "onRenderTimeStamp", js.undefined)
      
      inline def setStyles(value: IActivityItemStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTimeStamp(value: String | js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      inline def setTimeStampVarargs(value: ReactNode*): Self = StObject.set(x, "timeStamp", js.Array(value :_*))
    }
  }
  
  trait IActivityItemStyles extends StObject {
    
    /**
      * Styles applied to the main container of the activity's description.
      */
    var activityContent: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the persona of the user that did this activity.
      */
    var activityPersona: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the activity's description.
      */
    var activityText: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the icon indicating the type of the activity. Only shown when personas are unavailable.
      */
    var activityTypeIcon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the text of comments.
      */
    var commentText: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to personas when two users are involved in a single activity.
      */
    var doublePersona: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to main text container in the compact variant.
      */
    var isCompactContent: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to personas and icons in the compact variant.
      */
    var isCompactIcon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to personas in the compact variant.
      */
    var isCompactPersona: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to a wrapper around personas in the compact variant.
      */
    var isCompactPersonaContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to root in the compact variant.
      */
    var isCompactRoot: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the timestamp in compact mode.
      * This can occur if a host overrides the render behavior to force the timestamp to render.
      */
    var isCompactTimeStamp: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the container of the persona image or activity type icon.
      */
    var personaContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the root activity item container.
      */
    var pulsingBeacon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the root activity item container.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Styles applied to the timestamp at the end of each activity item.
      */
    var timeStamp: js.UndefOr[IStyle] = js.undefined
  }
  object IActivityItemStyles {
    
    inline def apply(): IActivityItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActivityItemStyles]
    }
    
    extension [Self <: IActivityItemStyles](x: Self) {
      
      inline def setActivityContent(value: IStyle): Self = StObject.set(x, "activityContent", value.asInstanceOf[js.Any])
      
      inline def setActivityContentNull: Self = StObject.set(x, "activityContent", null)
      
      inline def setActivityContentUndefined: Self = StObject.set(x, "activityContent", js.undefined)
      
      inline def setActivityPersona(value: IStyle): Self = StObject.set(x, "activityPersona", value.asInstanceOf[js.Any])
      
      inline def setActivityPersonaNull: Self = StObject.set(x, "activityPersona", null)
      
      inline def setActivityPersonaUndefined: Self = StObject.set(x, "activityPersona", js.undefined)
      
      inline def setActivityText(value: IStyle): Self = StObject.set(x, "activityText", value.asInstanceOf[js.Any])
      
      inline def setActivityTextNull: Self = StObject.set(x, "activityText", null)
      
      inline def setActivityTextUndefined: Self = StObject.set(x, "activityText", js.undefined)
      
      inline def setActivityTypeIcon(value: IStyle): Self = StObject.set(x, "activityTypeIcon", value.asInstanceOf[js.Any])
      
      inline def setActivityTypeIconNull: Self = StObject.set(x, "activityTypeIcon", null)
      
      inline def setActivityTypeIconUndefined: Self = StObject.set(x, "activityTypeIcon", js.undefined)
      
      inline def setCommentText(value: IStyle): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
      
      inline def setCommentTextNull: Self = StObject.set(x, "commentText", null)
      
      inline def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
      
      inline def setDoublePersona(value: IStyle): Self = StObject.set(x, "doublePersona", value.asInstanceOf[js.Any])
      
      inline def setDoublePersonaNull: Self = StObject.set(x, "doublePersona", null)
      
      inline def setDoublePersonaUndefined: Self = StObject.set(x, "doublePersona", js.undefined)
      
      inline def setIsCompactContent(value: IStyle): Self = StObject.set(x, "isCompactContent", value.asInstanceOf[js.Any])
      
      inline def setIsCompactContentNull: Self = StObject.set(x, "isCompactContent", null)
      
      inline def setIsCompactContentUndefined: Self = StObject.set(x, "isCompactContent", js.undefined)
      
      inline def setIsCompactIcon(value: IStyle): Self = StObject.set(x, "isCompactIcon", value.asInstanceOf[js.Any])
      
      inline def setIsCompactIconNull: Self = StObject.set(x, "isCompactIcon", null)
      
      inline def setIsCompactIconUndefined: Self = StObject.set(x, "isCompactIcon", js.undefined)
      
      inline def setIsCompactPersona(value: IStyle): Self = StObject.set(x, "isCompactPersona", value.asInstanceOf[js.Any])
      
      inline def setIsCompactPersonaContainer(value: IStyle): Self = StObject.set(x, "isCompactPersonaContainer", value.asInstanceOf[js.Any])
      
      inline def setIsCompactPersonaContainerNull: Self = StObject.set(x, "isCompactPersonaContainer", null)
      
      inline def setIsCompactPersonaContainerUndefined: Self = StObject.set(x, "isCompactPersonaContainer", js.undefined)
      
      inline def setIsCompactPersonaNull: Self = StObject.set(x, "isCompactPersona", null)
      
      inline def setIsCompactPersonaUndefined: Self = StObject.set(x, "isCompactPersona", js.undefined)
      
      inline def setIsCompactRoot(value: IStyle): Self = StObject.set(x, "isCompactRoot", value.asInstanceOf[js.Any])
      
      inline def setIsCompactRootNull: Self = StObject.set(x, "isCompactRoot", null)
      
      inline def setIsCompactRootUndefined: Self = StObject.set(x, "isCompactRoot", js.undefined)
      
      inline def setIsCompactTimeStamp(value: IStyle): Self = StObject.set(x, "isCompactTimeStamp", value.asInstanceOf[js.Any])
      
      inline def setIsCompactTimeStampNull: Self = StObject.set(x, "isCompactTimeStamp", null)
      
      inline def setIsCompactTimeStampUndefined: Self = StObject.set(x, "isCompactTimeStamp", js.undefined)
      
      inline def setPersonaContainer(value: IStyle): Self = StObject.set(x, "personaContainer", value.asInstanceOf[js.Any])
      
      inline def setPersonaContainerNull: Self = StObject.set(x, "personaContainer", null)
      
      inline def setPersonaContainerUndefined: Self = StObject.set(x, "personaContainer", js.undefined)
      
      inline def setPulsingBeacon(value: IStyle): Self = StObject.set(x, "pulsingBeacon", value.asInstanceOf[js.Any])
      
      inline def setPulsingBeaconNull: Self = StObject.set(x, "pulsingBeacon", null)
      
      inline def setPulsingBeaconUndefined: Self = StObject.set(x, "pulsingBeacon", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTimeStamp(value: IStyle): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampNull: Self = StObject.set(x, "timeStamp", null)
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
}
