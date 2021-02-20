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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityItemTypesMod {
  
  @js.native
  trait IActivityItemProps extends AllHTMLAttributes[HTMLElement] {
    
    /**
      * An element describing the activity that took place. If no activityDescription, activityDescriptionText, or
      * onRenderActivityDescription are included, no description of the activity is shown.
      */
    var activityDescription: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
    
    /**
      * Text describing the activity that occurred and naming the people involved in it.
      * Deprecated, use `activityDescription` instead.
      * @deprecated Use `activityDescription` instead.
      */
    var activityDescriptionText: js.UndefOr[String] = js.native
    
    /**
      * An element containing an icon shown next to the activity item.
      */
    var activityIcon: js.UndefOr[ReactNode] = js.native
    
    /**
      * If activityIcon is not set, then the persona props in this array will be used as the icon for this activity item.
      */
    var activityPersonas: js.UndefOr[js.Array[IPersonaSharedProps]] = js.native
    
    /**
      * Enables/Disables the beacon that radiates
      * from the center of the center of the activity icon. Signals an activity has started.
      * @defaultvalue false
      */
    var animateBeaconSignal: js.UndefOr[Boolean] = js.native
    
    /**
      * Beacon color one
      */
    var beaconColorOne: js.UndefOr[String] = js.native
    
    /**
      * Beacon color two
      */
    var beaconColorTwo: js.UndefOr[String] = js.native
    
    /**
      * Text of comments or \@mention messages.
      * Deprecated, use `comments` instead.
      * @deprecated Use `comments` instead.
      */
    var commentText: js.UndefOr[String] = js.native
    
    /**
      * An element containing the text of comments or \@mention messages.
      * If no comments, commentText, or onRenderComments are included, no comments are shown.
      */
    var comments: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
    
    /**
      * Indicated if the compact styling should be used.
      */
    var isCompact: js.UndefOr[Boolean] = js.native
    
    /**
      * A renderer for the description of the current activity.
      */
    var onRenderActivityDescription: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.native
    
    /**
      * A renderer that adds the text of a comment below the activity description.
      */
    var onRenderComments: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.native
    
    /**
      * A renderer to create the icon next to the activity item.
      */
    var onRenderIcon: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.native
    
    /**
      * A renderer adds a time stamp. If not included, timeStamp is shown as plain text below the activity.
      */
    var onRenderTimeStamp: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.native
    
    /**
      * Optional styling for the elements within the Activity Item.
      */
    var styles: js.UndefOr[IActivityItemStyles] = js.native
    
    /**
      * Element shown as a timestamp on this activity. If not included, no timestamp is shown.
      */
    var timeStamp: js.UndefOr[String | js.Array[ReactNode] | ReactNode] = js.native
  }
  object IActivityItemProps {
    
    @scala.inline
    def apply(): IActivityItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActivityItemProps]
    }
    
    @scala.inline
    implicit class IActivityItemPropsMutableBuilder[Self <: IActivityItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityDescription(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "activityDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityDescriptionText(value: String): Self = StObject.set(x, "activityDescriptionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityDescriptionTextUndefined: Self = StObject.set(x, "activityDescriptionText", js.undefined)
      
      @scala.inline
      def setActivityDescriptionUndefined: Self = StObject.set(x, "activityDescription", js.undefined)
      
      @scala.inline
      def setActivityDescriptionVarargs(value: ReactNode*): Self = StObject.set(x, "activityDescription", js.Array(value :_*))
      
      @scala.inline
      def setActivityIcon(value: ReactNode): Self = StObject.set(x, "activityIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityIconUndefined: Self = StObject.set(x, "activityIcon", js.undefined)
      
      @scala.inline
      def setActivityPersonas(value: js.Array[IPersonaSharedProps]): Self = StObject.set(x, "activityPersonas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityPersonasUndefined: Self = StObject.set(x, "activityPersonas", js.undefined)
      
      @scala.inline
      def setActivityPersonasVarargs(value: IPersonaSharedProps*): Self = StObject.set(x, "activityPersonas", js.Array(value :_*))
      
      @scala.inline
      def setAnimateBeaconSignal(value: Boolean): Self = StObject.set(x, "animateBeaconSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateBeaconSignalUndefined: Self = StObject.set(x, "animateBeaconSignal", js.undefined)
      
      @scala.inline
      def setBeaconColorOne(value: String): Self = StObject.set(x, "beaconColorOne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeaconColorOneUndefined: Self = StObject.set(x, "beaconColorOne", js.undefined)
      
      @scala.inline
      def setBeaconColorTwo(value: String): Self = StObject.set(x, "beaconColorTwo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeaconColorTwoUndefined: Self = StObject.set(x, "beaconColorTwo", js.undefined)
      
      @scala.inline
      def setCommentText(value: String): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
      
      @scala.inline
      def setComments(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setCommentsVarargs(value: ReactNode*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setIsCompact(value: Boolean): Self = StObject.set(x, "isCompact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompactUndefined: Self = StObject.set(x, "isCompact", js.undefined)
      
      @scala.inline
      def setOnRenderActivityDescription(
        value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderActivityDescription", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderActivityDescriptionUndefined: Self = StObject.set(x, "onRenderActivityDescription", js.undefined)
      
      @scala.inline
      def setOnRenderComments(
        value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderComments", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderCommentsUndefined: Self = StObject.set(x, "onRenderComments", js.undefined)
      
      @scala.inline
      def setOnRenderIcon(
        value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderIcon", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderIconUndefined: Self = StObject.set(x, "onRenderIcon", js.undefined)
      
      @scala.inline
      def setOnRenderTimeStamp(
        value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderTimeStamp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderTimeStampUndefined: Self = StObject.set(x, "onRenderTimeStamp", js.undefined)
      
      @scala.inline
      def setStyles(value: IActivityItemStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: String | js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      @scala.inline
      def setTimeStampVarargs(value: ReactNode*): Self = StObject.set(x, "timeStamp", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IActivityItemStyles extends StObject {
    
    /**
      * Styles applied to the main container of the activity's description.
      */
    var activityContent: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the persona of the user that did this activity.
      */
    var activityPersona: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the activity's description.
      */
    var activityText: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the icon indicating the type of the activity. Only shown when personas are unavailable.
      */
    var activityTypeIcon: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the text of comments.
      */
    var commentText: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to personas when two users are involved in a single activity.
      */
    var doublePersona: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to main text container in the compact variant.
      */
    var isCompactContent: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to personas and icons in the compact variant.
      */
    var isCompactIcon: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to personas in the compact variant.
      */
    var isCompactPersona: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to a wrapper around personas in the compact variant.
      */
    var isCompactPersonaContainer: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to root in the compact variant.
      */
    var isCompactRoot: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the timestamp in compact mode.
      * This can occur if a host overrides the render behavior to force the timestamp to render.
      */
    var isCompactTimeStamp: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the container of the persona image or activity type icon.
      */
    var personaContainer: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the root activity item container.
      */
    var pulsingBeacon: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the root activity item container.
      */
    var root: js.UndefOr[IStyle] = js.native
    
    /**
      * Styles applied to the timestamp at the end of each activity item.
      */
    var timeStamp: js.UndefOr[IStyle] = js.native
  }
  object IActivityItemStyles {
    
    @scala.inline
    def apply(): IActivityItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActivityItemStyles]
    }
    
    @scala.inline
    implicit class IActivityItemStylesMutableBuilder[Self <: IActivityItemStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityContent(value: IStyle): Self = StObject.set(x, "activityContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityContentNull: Self = StObject.set(x, "activityContent", null)
      
      @scala.inline
      def setActivityContentUndefined: Self = StObject.set(x, "activityContent", js.undefined)
      
      @scala.inline
      def setActivityPersona(value: IStyle): Self = StObject.set(x, "activityPersona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityPersonaNull: Self = StObject.set(x, "activityPersona", null)
      
      @scala.inline
      def setActivityPersonaUndefined: Self = StObject.set(x, "activityPersona", js.undefined)
      
      @scala.inline
      def setActivityText(value: IStyle): Self = StObject.set(x, "activityText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTextNull: Self = StObject.set(x, "activityText", null)
      
      @scala.inline
      def setActivityTextUndefined: Self = StObject.set(x, "activityText", js.undefined)
      
      @scala.inline
      def setActivityTypeIcon(value: IStyle): Self = StObject.set(x, "activityTypeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTypeIconNull: Self = StObject.set(x, "activityTypeIcon", null)
      
      @scala.inline
      def setActivityTypeIconUndefined: Self = StObject.set(x, "activityTypeIcon", js.undefined)
      
      @scala.inline
      def setCommentText(value: IStyle): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentTextNull: Self = StObject.set(x, "commentText", null)
      
      @scala.inline
      def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
      
      @scala.inline
      def setDoublePersona(value: IStyle): Self = StObject.set(x, "doublePersona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoublePersonaNull: Self = StObject.set(x, "doublePersona", null)
      
      @scala.inline
      def setDoublePersonaUndefined: Self = StObject.set(x, "doublePersona", js.undefined)
      
      @scala.inline
      def setIsCompactContent(value: IStyle): Self = StObject.set(x, "isCompactContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompactContentNull: Self = StObject.set(x, "isCompactContent", null)
      
      @scala.inline
      def setIsCompactContentUndefined: Self = StObject.set(x, "isCompactContent", js.undefined)
      
      @scala.inline
      def setIsCompactIcon(value: IStyle): Self = StObject.set(x, "isCompactIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompactIconNull: Self = StObject.set(x, "isCompactIcon", null)
      
      @scala.inline
      def setIsCompactIconUndefined: Self = StObject.set(x, "isCompactIcon", js.undefined)
      
      @scala.inline
      def setIsCompactPersona(value: IStyle): Self = StObject.set(x, "isCompactPersona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompactPersonaContainer(value: IStyle): Self = StObject.set(x, "isCompactPersonaContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompactPersonaContainerNull: Self = StObject.set(x, "isCompactPersonaContainer", null)
      
      @scala.inline
      def setIsCompactPersonaContainerUndefined: Self = StObject.set(x, "isCompactPersonaContainer", js.undefined)
      
      @scala.inline
      def setIsCompactPersonaNull: Self = StObject.set(x, "isCompactPersona", null)
      
      @scala.inline
      def setIsCompactPersonaUndefined: Self = StObject.set(x, "isCompactPersona", js.undefined)
      
      @scala.inline
      def setIsCompactRoot(value: IStyle): Self = StObject.set(x, "isCompactRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompactRootNull: Self = StObject.set(x, "isCompactRoot", null)
      
      @scala.inline
      def setIsCompactRootUndefined: Self = StObject.set(x, "isCompactRoot", js.undefined)
      
      @scala.inline
      def setIsCompactTimeStamp(value: IStyle): Self = StObject.set(x, "isCompactTimeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompactTimeStampNull: Self = StObject.set(x, "isCompactTimeStamp", null)
      
      @scala.inline
      def setIsCompactTimeStampUndefined: Self = StObject.set(x, "isCompactTimeStamp", js.undefined)
      
      @scala.inline
      def setPersonaContainer(value: IStyle): Self = StObject.set(x, "personaContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonaContainerNull: Self = StObject.set(x, "personaContainer", null)
      
      @scala.inline
      def setPersonaContainerUndefined: Self = StObject.set(x, "personaContainer", js.undefined)
      
      @scala.inline
      def setPulsingBeacon(value: IStyle): Self = StObject.set(x, "pulsingBeacon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulsingBeaconNull: Self = StObject.set(x, "pulsingBeacon", null)
      
      @scala.inline
      def setPulsingBeaconUndefined: Self = StObject.set(x, "pulsingBeacon", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: IStyle): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampNull: Self = StObject.set(x, "timeStamp", null)
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
}
