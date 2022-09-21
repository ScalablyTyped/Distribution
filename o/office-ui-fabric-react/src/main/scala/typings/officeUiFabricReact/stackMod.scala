package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIStackProps
import typings.officeUiFabricReact.anon.WeakValidationMapIStackPr
import typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typings.officeUiFabricReact.stackTypesMod.IStackProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  /* Inlined react.react.FunctionComponent<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackProps> & {  Item :react.react.FunctionComponent<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/StackItem/StackItem.types.IStackItemProps>} */
  object Stack {
    
    inline def apply(props: IStackProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: IStackProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("office-ui-fabric-react/lib/components/Stack", "Stack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Stack", "Stack.Item")
    @js.native
    def Item: FunctionComponent[IStackItemProps] = js.native
    inline def Item_=(x: FunctionComponent[IStackItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Stack", "Stack.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Stack", "Stack.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialIStackProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialIStackProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Stack", "Stack.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Stack", "Stack.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapIStackPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapIStackPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Stack", "StackItem")
  @js.native
  val StackItem: FunctionComponent[IStackItemProps] = js.native
}
