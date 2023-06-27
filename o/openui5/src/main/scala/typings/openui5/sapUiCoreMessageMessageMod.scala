package typings.openui5

import typings.openui5.anon.AdditionalText
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreLibraryMod.MessageType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMessageMessageMod {
  
  @JSImport("sap/ui/core/message/Message", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Message.
    */
  open class default () extends Message {
    def this(/**
      * a map which contains the following parameter properties:
      */
    mParameters: AdditionalText) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/message/Message", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.message.Message with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Message]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Message],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.message.Message.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Message
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Returns the messages additional text.
      *
      * @returns The additionaltext
      */
    def getAdditionalText(): String = js.native
    
    /**
      * Returns the message code
      *
      * @returns code
      */
    def getCode(): String = js.native
    
    /**
      * Returns the control ID if set.
      *
      * NOTE: The control ID is only set for Controls based on `sap.m.InputBase` The Control must be bound to
      * a Model so the Message could be propagated to this Control. The propagation happens only if the Control
      * is created and visible on the screen. Is this the case the control ID is set. The ID is not set in all
      * other cases and cannot be set manually.
      *
      * If a Message is propagated to multiple Controls bound to the same target the last Control wins.
      *
      * @returns sControlId
      */
    def getControlId(): String = js.native
    
    /**
      * Returns an array of control IDs.
      *
      * NOTE: The control ID is only set for Controls based on `sap.m.InputBase`. The Control must be bound to
      * a Model so the Message could be propagated to this Control. The propagation happens only if the Control
      * is created and visible on the screen. The ID is not set in all other cases and cannot be set manually.
      *
      * @returns aControlIds
      */
    def getControlIds(): js.Array[Any] = js.native
    
    /**
      * Set the date of the message
      *
      * @returns The message date in number of milliseconds elapsed since 1 January 1970 00:00:00 UTC. As returned
      * by Date.now().
      */
    def getDate(): int = js.native
    
    /**
      * Returns the message description
      *
      * @returns description
      */
    def getDescription(): String = js.native
    
    /**
      * Returns the message description URL which should be used to download the description content
      *
      * @returns The URL pointing to the description long text
      */
    def getDescriptionUrl(): String = js.native
    
    /**
      * Returns the Message Id
      *
      * @returns id
      */
    def getId(): String = js.native
    
    /**
      * Returns message text
      *
      * @returns message
      */
    def getMessage(): String = js.native
    
    /**
      * Returns the message processor
      *
      * @returns processor
      */
    def getMessageProcessor(): typings.openui5.sapUiCoreMessageMessageProcessorMod.default = js.native
    
    /**
      * Returns the if Message is persistent
      *
      * @returns bPersistent
      */
    def getPersistent(): Boolean = js.native
    
    /**
      * @deprecated (since 1.79.0) - As a message may have multiple targets, use {@link #getTargets} instead
      *
      * Returns the message target or the first target if the message has multiple targets.
      *
      * @returns The message target
      */
    def getTarget(): String = js.native
    
    /**
      * @since 1.79
      *
      * Returns the targets of this message.
      *
      * @returns The message targets; empty array if the message has no targets
      */
    def getTargets(): js.Array[String] = js.native
    
    /**
      * Returns the if Message set as technical message
      *
      * @returns true if message is technical or false if not
      */
    def getTechnical(): Boolean = js.native
    
    /**
      * Returns the technical details of the message
      *
      * @returns The technical details
      */
    def getTechnicalDetails(): js.Object = js.native
    
    /**
      * Returns the message type
      *
      * @returns type
      */
    def getType(): MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) = js.native
    
    /**
      * Sets the additionaltext for the message or merge different additionaltext strings
      */
    def setAdditionalText(/**
      * The additionaltext.
      */
    sAdditionalText: String): Unit = js.native
    
    /**
      * Set message code
      */
    def setCode(/**
      * The Message code
      */
    sCode: String): Unit = js.native
    
    /**
      * Set the date of the message, this will automatically be set on message creation
      */
    def setDate(
      /**
      * The message date in number of milliseconds elapsed since 1 January 1970 00:00:00 UTC. As returned by
      * Date.now().
      */
    iDate: int
    ): Unit = js.native
    
    /**
      * Set message description
      */
    def setDescription(/**
      * The Message description
      */
    sDescription: String): Unit = js.native
    
    /**
      * Set message description URL which should be used to download the description content
      */
    def setDescriptionUrl(/**
      * The URL pointing to the description long text
      */
    sDescriptionUrl: String): Unit = js.native
    
    /**
      * Set message text
      */
    def setMessage(/**
      * The Message as text
      */
    sMessage: String): Unit = js.native
    
    /**
      * Set message processor
      */
    def setMessageProcessor(/**
      * The Message processor
      */
    oMessageProcessor: typings.openui5.sapUiModelModelMod.default): Unit = js.native
    
    /**
      * Set message persistent
      */
    def setPersistent(
      /**
      * Set Message persistent: If persisten is set true the message lifecycle controlled by Application
      */
    bPersistent: Boolean
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.79.0) - As a message may have multiple targets, use {@link #setTargets} instead
      *
      * Sets the message target; in case the message has multiple targets, sets the first target of the message.
      * The syntax is MessageProcessor dependent. See the documentation of the respective MessageProcessor.
      */
    def setTarget(/**
      * The message target
      */
    sTarget: String): Unit = js.native
    
    /**
      * @since 1.79
      *
      * Sets the targets of this message.
      */
    def setTargets(
      /**
      * The new targets of this message; use an empty array if the message shall have no targets
      */
    aNewTargets: js.Array[String]
    ): Unit = js.native
    
    /**
      * Set message as technical message
      */
    def setTechnical(
      /**
      * Set Message as technical message lifecycle controlled by Application
      */
    bTechnical: Boolean
    ): Unit = js.native
    
    /**
      * Set the technical details for the message
      */
    def setTechnicalDetails(/**
      * The technical details of the message
      */
    oTechnicalDetails: js.Object): Unit = js.native
    
    def setType(
      /**
      * The Message type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
    ): Unit = js.native
    /**
      * Set message type
      */
    def setType(/**
      * The Message type
      */
    sType: MessageType): Unit = js.native
  }
}
