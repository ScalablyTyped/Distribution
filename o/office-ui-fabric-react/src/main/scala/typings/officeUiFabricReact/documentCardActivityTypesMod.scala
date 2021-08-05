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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardActivityTypesMod {
  
  trait IDocumentCardActivity extends StObject
  
  trait IDocumentCardActivityPerson extends StObject {
    
    /**
      * Whether initials are calculated for phone numbers and number sequences.
      * Example: Set property to true to get initials for project names consisting of numbers only.
      * @defaultvalue false
      */
    var allowPhoneInitials: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The user's initials to display in the profile photo area when there is no image.
      */
    var initials: js.UndefOr[String] = js.undefined
    
    /**
      * The background color when the user's initials are displayed.
      * @defaultvalue PersonaInitialsColor.blue
      */
    var initialsColor: js.UndefOr[PersonaInitialsColor] = js.undefined
    
    /**
      * The name of the person.
      */
    var name: String
    
    /**
      * Path to the profile photo of the person.
      */
    var profileImageSrc: String
  }
  object IDocumentCardActivityPerson {
    
    inline def apply(name: String, profileImageSrc: String): IDocumentCardActivityPerson = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profileImageSrc = profileImageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActivityPerson]
    }
    
    extension [Self <: IDocumentCardActivityPerson](x: Self) {
      
      inline def setAllowPhoneInitials(value: Boolean): Self = StObject.set(x, "allowPhoneInitials", value.asInstanceOf[js.Any])
      
      inline def setAllowPhoneInitialsUndefined: Self = StObject.set(x, "allowPhoneInitials", js.undefined)
      
      inline def setInitials(value: String): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsColor(value: PersonaInitialsColor): Self = StObject.set(x, "initialsColor", value.asInstanceOf[js.Any])
      
      inline def setInitialsColorUndefined: Self = StObject.set(x, "initialsColor", js.undefined)
      
      inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProfileImageSrc(value: String): Self = StObject.set(x, "profileImageSrc", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardActivityProps
    extends StObject
       with ClassAttributes[DocumentCardActivityBase] {
    
    /**
      * Describes the activity that has taken place, such as "Created Feb 23, 2016".
      */
    var activity: String
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardActivity]] = js.undefined
    
    /**
      * One or more people who are involved in this activity.
      */
    var people: js.Array[IDocumentCardActivityPerson]
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]
      ] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDocumentCardActivityProps {
    
    inline def apply(activity: String, people: js.Array[IDocumentCardActivityPerson]): IDocumentCardActivityProps = {
      val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActivityProps]
    }
    
    extension [Self <: IDocumentCardActivityProps](x: Self) {
      
      inline def setActivity(value: String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDocumentCardActivity]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDocumentCardActivity | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setPeople(value: js.Array[IDocumentCardActivityPerson]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
      
      inline def setPeopleVarargs(value: IDocumentCardActivityPerson*): Self = StObject.set(x, "people", js.Array(value :_*))
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardActivityStyleProps => DeepPartial[IDocumentCardActivityStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IDocumentCardActivityStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if multiple people are being shown.
      */
    var multiplePeople: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDocumentCardActivityStyleProps {
    
    inline def apply(theme: ITheme): IDocumentCardActivityStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActivityStyleProps]
    }
    
    extension [Self <: IDocumentCardActivityStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMultiplePeople(value: Boolean): Self = StObject.set(x, "multiplePeople", value.asInstanceOf[js.Any])
      
      inline def setMultiplePeopleUndefined: Self = StObject.set(x, "multiplePeople", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardActivityStyles extends StObject {
    
    var activity: IStyle
    
    var avatar: IStyle
    
    var avatars: IStyle
    
    var details: IStyle
    
    var name: IStyle
    
    var root: IStyle
  }
  object IDocumentCardActivityStyles {
    
    inline def apply(): IDocumentCardActivityStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardActivityStyles]
    }
    
    extension [Self <: IDocumentCardActivityStyles](x: Self) {
      
      inline def setActivity(value: IStyle): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setActivityNull: Self = StObject.set(x, "activity", null)
      
      inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
      
      inline def setAvatar(value: IStyle): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setAvatars(value: IStyle): Self = StObject.set(x, "avatars", value.asInstanceOf[js.Any])
      
      inline def setAvatarsNull: Self = StObject.set(x, "avatars", null)
      
      inline def setAvatarsUndefined: Self = StObject.set(x, "avatars", js.undefined)
      
      inline def setDetails(value: IStyle): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsNull: Self = StObject.set(x, "details", null)
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setName(value: IStyle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
