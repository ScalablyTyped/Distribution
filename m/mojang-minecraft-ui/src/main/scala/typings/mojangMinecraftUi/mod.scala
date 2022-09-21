package typings.mojangMinecraftUi

import typings.mojangMinecraft.mod.Player
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mojang-minecraft-ui", "ActionFormData")
  @js.native
  open class ActionFormData () extends StObject {
    
    /**
      * @remarks
      * Method that sets the body text for the modal form.
      * @param bodyText
      */
    def body(bodyText: String): ActionFormData = js.native
    
    /**
      * @remarks
      * Adds a button to this form with an icon from a resource
      * pack.
      * @param text
      * @param iconPath
      */
    def button(text: String): ActionFormData = js.native
    def button(text: String, iconPath: String): ActionFormData = js.native
    
    /**
      * @remarks
      * Creates and shows this modal popup form. Returns
      * asynchronously when the player confirms or cancels the
      * dialog.
      * @param player
      * Player to show this dialog to.
      * @throws This function can throw errors.
      */
    def show(player: Player): js.Promise[ActionFormResponse] = js.native
    
    /**
      * @remarks
      * This builder method sets the title for the modal dialog.
      * @param titleText
      */
    def title(titleText: String): ActionFormData = js.native
  }
  
  @JSImport("mojang-minecraft-ui", "ActionFormResponse")
  @js.native
  /* protected */ open class ActionFormResponse () extends FormResponse {
    
    /**
      * Returns the index of the button that was pushed.
      */
    val selection: Double = js.native
  }
  
  @JSImport("mojang-minecraft-ui", "FormResponse")
  @js.native
  /* protected */ open class FormResponse () extends StObject {
    
    /**
      * If true, the form was canceled by the player (e.g., they
      * selected the pop-up X close button).
      */
    val isCanceled: Boolean = js.native
  }
  
  @JSImport("mojang-minecraft-ui", "MessageFormData")
  @js.native
  open class MessageFormData () extends StObject {
    
    /**
      * @remarks
      * Method that sets the body text for the modal form.
      * @param bodyText
      */
    def body(bodyText: String): MessageFormData = js.native
    
    /**
      * @remarks
      * Method that sets the text for the first button of the
      * dialog.
      * @param text
      */
    def button1(text: String): MessageFormData = js.native
    
    /**
      * @remarks
      * This method sets the text for the second button on the
      * dialog.
      * @param text
      */
    def button2(text: String): MessageFormData = js.native
    
    /**
      * @remarks
      * Creates and shows this modal popup form. Returns
      * asynchronously when the player confirms or cancels the
      * dialog.
      * @param player
      * Player to show this dialog to.
      * @throws This function can throw errors.
      */
    def show(player: Player): js.Promise[MessageFormResponse] = js.native
    
    /**
      * @remarks
      * This builder method sets the title for the modal dialog.
      * @param titleText
      */
    def title(titleText: String): MessageFormData = js.native
  }
  
  @JSImport("mojang-minecraft-ui", "MessageFormResponse")
  @js.native
  /* protected */ open class MessageFormResponse () extends FormResponse {
    
    /**
      * Returns the index of the button that was pushed.
      */
    val selection: Double = js.native
  }
  
  @JSImport("mojang-minecraft-ui", "ModalFormData")
  @js.native
  open class ModalFormData () extends StObject {
    
    /**
      * @remarks
      * Adds a dropdown with choices to the form.
      * @param label
      * @param options
      * @param defaultValueIndex
      */
    def dropdown(label: String, options: js.Array[String]): ModalFormData = js.native
    def dropdown(label: String, options: js.Array[String], defaultValueIndex: Double): ModalFormData = js.native
    
    /**
      * @remarks
      * Adds an icon to the form using a graphic resource from a
      * resource pack.
      * @param iconPath
      */
    def icon(iconPath: String): ModalFormData = js.native
    
    /**
      * @remarks
      * Creates and shows this modal popup form. Returns
      * asynchronously when the player confirms or cancels the
      * dialog.
      * @param player
      * Player to show this dialog to.
      * @throws This function can throw errors.
      */
    def show(player: Player): js.Promise[ModalFormResponse] = js.native
    
    /**
      * @remarks
      * Adds a numeric slider to the form.
      * @param label
      * @param minimumValue
      * @param maximumValue
      * @param valueStep
      * @param defaultValue
      */
    def slider(label: String, minimumValue: Double, maximumValue: Double, valueStep: Double): ModalFormData = js.native
    def slider(label: String, minimumValue: Double, maximumValue: Double, valueStep: Double, defaultValue: Double): ModalFormData = js.native
    
    /**
      * @remarks
      * Adds a textbox to the form.
      * @param label
      * @param placeholderText
      * @param defaultValue
      */
    def textField(label: String, placeholderText: String): ModalFormData = js.native
    def textField(label: String, placeholderText: String, defaultValue: String): ModalFormData = js.native
    
    /**
      * @remarks
      * This builder method sets the title for the modal dialog.
      * @param titleText
      */
    def title(titleText: String): ModalFormData = js.native
    
    /**
      * @remarks
      * Adds a toggle checkbox button to the form.
      * @param label
      * @param defaultValue
      */
    def toggle(label: String): ModalFormData = js.native
    def toggle(label: String, defaultValue: Boolean): ModalFormData = js.native
  }
  
  @JSImport("mojang-minecraft-ui", "ModalFormResponse")
  @js.native
  /* protected */ open class ModalFormResponse () extends FormResponse {
    
    /**
      * An ordered set of values based on the order of controls
      * specified by ModalFormData.
      */
    val formValues: js.Array[Any] = js.native
  }
}
