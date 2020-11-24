package typings.officeUiFabricReact.activityItemTypesMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IActivityItemPropsOps[Self <: IActivityItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivityDescriptionVarargs(value: ReactNode*): Self = this.set("activityDescription", js.Array(value :_*))
    
    @scala.inline
    def setActivityDescription(value: js.Array[ReactNode] | ReactNode): Self = this.set("activityDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityDescription: Self = this.set("activityDescription", js.undefined)
    
    @scala.inline
    def setActivityDescriptionText(value: String): Self = this.set("activityDescriptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityDescriptionText: Self = this.set("activityDescriptionText", js.undefined)
    
    @scala.inline
    def setActivityIcon(value: ReactNode): Self = this.set("activityIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityIcon: Self = this.set("activityIcon", js.undefined)
    
    @scala.inline
    def setActivityPersonasVarargs(value: IPersonaSharedProps*): Self = this.set("activityPersonas", js.Array(value :_*))
    
    @scala.inline
    def setActivityPersonas(value: js.Array[IPersonaSharedProps]): Self = this.set("activityPersonas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityPersonas: Self = this.set("activityPersonas", js.undefined)
    
    @scala.inline
    def setAnimateBeaconSignal(value: Boolean): Self = this.set("animateBeaconSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateBeaconSignal: Self = this.set("animateBeaconSignal", js.undefined)
    
    @scala.inline
    def setBeaconColorOne(value: String): Self = this.set("beaconColorOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeaconColorOne: Self = this.set("beaconColorOne", js.undefined)
    
    @scala.inline
    def setBeaconColorTwo(value: String): Self = this.set("beaconColorTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeaconColorTwo: Self = this.set("beaconColorTwo", js.undefined)
    
    @scala.inline
    def setCommentText(value: String): Self = this.set("commentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentText: Self = this.set("commentText", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: ReactNode*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[ReactNode] | ReactNode): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setIsCompact(value: Boolean): Self = this.set("isCompact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompact: Self = this.set("isCompact", js.undefined)
    
    @scala.inline
    def setOnRenderActivityDescription(
      value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderActivityDescription", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderActivityDescription: Self = this.set("onRenderActivityDescription", js.undefined)
    
    @scala.inline
    def setOnRenderComments(
      value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderComments", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderComments: Self = this.set("onRenderComments", js.undefined)
    
    @scala.inline
    def setOnRenderIcon(
      value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderIcon", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderIcon: Self = this.set("onRenderIcon", js.undefined)
    
    @scala.inline
    def setOnRenderTimeStamp(
      value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderTimeStamp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderTimeStamp: Self = this.set("onRenderTimeStamp", js.undefined)
    
    @scala.inline
    def setStyles(value: IActivityItemStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTimeStampVarargs(value: ReactNode*): Self = this.set("timeStamp", js.Array(value :_*))
    
    @scala.inline
    def setTimeStamp(value: String | js.Array[ReactNode] | ReactNode): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
  }
}
