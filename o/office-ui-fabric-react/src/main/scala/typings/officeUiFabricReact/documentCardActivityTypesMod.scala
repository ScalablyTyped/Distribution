package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.documentCardActivityBaseMod.DocumentCardActivityBase
import typings.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import typings.react.mod.ClassAttributes
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardActivityTypesMod {
  
  @js.native
  trait IDocumentCardActivity extends StObject
  
  @js.native
  trait IDocumentCardActivityPerson extends StObject {
    
    /**
      * Whether initials are calculated for phone numbers and number sequences.
      * Example: Set property to true to get initials for project names consisting of numbers only.
      * @defaultvalue false
      */
    var allowPhoneInitials: js.UndefOr[Boolean] = js.native
    
    /**
      * The user's initials to display in the profile photo area when there is no image.
      */
    var initials: js.UndefOr[String] = js.native
    
    /**
      * The background color when the user's initials are displayed.
      * @defaultvalue PersonaInitialsColor.blue
      */
    var initialsColor: js.UndefOr[PersonaInitialsColor] = js.native
    
    /**
      * The name of the person.
      */
    var name: String = js.native
    
    /**
      * Path to the profile photo of the person.
      */
    var profileImageSrc: String = js.native
  }
  object IDocumentCardActivityPerson {
    
    @scala.inline
    def apply(name: String, profileImageSrc: String): IDocumentCardActivityPerson = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profileImageSrc = profileImageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActivityPerson]
    }
    
    @scala.inline
    implicit class IDocumentCardActivityPersonMutableBuilder[Self <: IDocumentCardActivityPerson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowPhoneInitials(value: Boolean): Self = StObject.set(x, "allowPhoneInitials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPhoneInitialsUndefined: Self = StObject.set(x, "allowPhoneInitials", js.undefined)
      
      @scala.inline
      def setInitials(value: String): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialsColor(value: PersonaInitialsColor): Self = StObject.set(x, "initialsColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialsColorUndefined: Self = StObject.set(x, "initialsColor", js.undefined)
      
      @scala.inline
      def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileImageSrc(value: String): Self = StObject.set(x, "profileImageSrc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardActivityProps extends ClassAttributes[DocumentCardActivityBase] {
    
    /**
      * Describes the activity that has taken place, such as "Created Feb 23, 2016".
      */
    var activity: String = js.native
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardActivity]] = js.native
    
    /**
      * One or more people who are involved in this activity.
      */
    var people: js.Array[IDocumentCardActivityPerson] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]
      ] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IDocumentCardActivityProps {
    
    @scala.inline
    def apply(activity: String, people: js.Array[IDocumentCardActivityPerson]): IDocumentCardActivityProps = {
      val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActivityProps]
    }
    
    @scala.inline
    implicit class IDocumentCardActivityPropsMutableBuilder[Self <: IDocumentCardActivityProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivity(value: String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardActivity]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardActivity | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setPeople(value: js.Array[IDocumentCardActivityPerson]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeopleVarargs(value: IDocumentCardActivityPerson*): Self = StObject.set(x, "people", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardActivityStyleProps => DeepPartial[IDocumentCardActivityStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IDocumentCardActivityStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Indicates if multiple people are being shown.
      */
    var multiplePeople: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDocumentCardActivityStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardActivityStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActivityStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardActivityStylePropsMutableBuilder[Self <: IDocumentCardActivityStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMultiplePeople(value: Boolean): Self = StObject.set(x, "multiplePeople", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplePeopleUndefined: Self = StObject.set(x, "multiplePeople", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardActivityStyles extends StObject {
    
    var activity: IStyle = js.native
    
    var avatar: IStyle = js.native
    
    var avatars: IStyle = js.native
    
    var details: IStyle = js.native
    
    var name: IStyle = js.native
    
    var root: IStyle = js.native
  }
  object IDocumentCardActivityStyles {
    
    @scala.inline
    def apply(): IDocumentCardActivityStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardActivityStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardActivityStylesMutableBuilder[Self <: IDocumentCardActivityStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivity(value: IStyle): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityNull: Self = StObject.set(x, "activity", null)
      
      @scala.inline
      def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
      
      @scala.inline
      def setAvatar(value: IStyle): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarNull: Self = StObject.set(x, "avatar", null)
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setAvatars(value: IStyle): Self = StObject.set(x, "avatars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarsNull: Self = StObject.set(x, "avatars", null)
      
      @scala.inline
      def setAvatarsUndefined: Self = StObject.set(x, "avatars", js.undefined)
      
      @scala.inline
      def setDetails(value: IStyle): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsNull: Self = StObject.set(x, "details", null)
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setName(value: IStyle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
